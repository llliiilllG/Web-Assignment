import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import HomePage from './HomePage';
import TermsAndConditions from './TermsAndConditions';
import Footer from './Footer';
import PrivacyPolicy from './PrivacyPolicy';
import LoginSignup from './LoginSignup';
import LateReturnPolicy from "./LateReturnPolicy";
import CancellationPolicy from './CancellationPolicy';


import Sidebar from './admin/Sidebar';
import CarList from "./admin/CarList.tsx";
import UserList from "./admin/UserList.tsx";
import CarBookingList from "./admin/CarBookingList.tsx";
import CarAll from "./CarAll.tsx";
import Navbar from "./Navbar.tsx";


const App: React.FC = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/login" element={<LoginSignup/>} />

                <Route path="*" element={<MainLayout />} />
                <Route path="/admin/*" element={<AdminLayout/>}/>

            </Routes>
        </BrowserRouter>

    );
};

const MainLayout: React.FC = () => (
    <>

        <Navbar/>
        <Routes>

            <Route path="/" element={<HomePage />} />
            <Route path="/contract" element={<TermsAndConditions />} />
            <Route path="/pri" element={<PrivacyPolicy/>} />
            <Route path="/LateReturnPolicy" element={<LateReturnPolicy/>} />
            <Route path="/CancellationPolicy" element={<CancellationPolicy/>} />
            <Route path="/car" element={<CarAll/>} />

        </Routes>
        <Footer/>

    </>
);

const AdminLayout: React.FC = () => (
    <div className="admin-layout">
        <Sidebar />
        <div className="admin-content">
            <Routes>

                <Route path="/carlist" element={<CarList />} />
                <Route path="/userlist" element={<UserList />} />
                <Route path="/carbookinglist" element={<CarBookingList />} />

            </Routes>

        </div>
</div>
);

export default App;





