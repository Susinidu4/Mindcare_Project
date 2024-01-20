<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Profile.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav>
        <div class="menu-items">
            <ul class="navLinks">
                <li class="navList">
                    <a href="home.jsp">
                        <ion-icon name="home-outline"></ion-icon>
                        <span class="links">Home</span>
                    </a>
                </li>
                <li class="navList active">
                    <a href="#">
                        <ion-icon name="stats-chart-outline"></ion-icon>
                        <span class="links">Dashboard</span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="folder-outline"></ion-icon>
                        <span class="links">Appointment History</span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="ticket-outline"></ion-icon>
                        <span class="links">Ticket History</span>
                    </a>
                </li>
                <li class="navList">
                    <a href="FeedbackDisplay.jsp">
                        <ion-icon name="star-half-outline"></ion-icon>
                        <span class="links">Feedback History</span>
                    </a>
                </li>
               
            </ul>
            <ul class="bottom-link">
                <li>
                    <a href="#">
                        <ion-icon name="person-circle-outline"></ion-icon>
                        <span class="links">Profile</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <ion-icon name="log-out-outline"></ion-icon>
                        <span class="links">Logout</span>
                    </a>
                </li>
            </ul>
        </div>
    </nav>

    <section class="dashboard">
        <div class="container">
            
        </div>
    </section>

    <script src="Profile.js"></script>
    
    <!-- Sources for icons -->
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    
</body>
</html>