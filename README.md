# 🛒 Shopping List App

A full-stack Java Spring Boot web application for managing shopping lists with user authentication, category-based product tracking, and clean MVC architecture.

## 🌐 Live Demo
🚀 [Coming Soon – Deployed on Render.com](#)

## 📸 Screenshots
*(Add screenshots or GIFs of the login page, dashboard, product form, etc. here for visual context)*

---

## 🔧 Technologies Used
- **Backend:** Java 17, Spring Boot, Spring MVC, Spring Security, Spring Data JPA
- **Database:** MySQL / H2 (dev)
- **Frontend:** Thymeleaf (Server-side rendering)
- **Build Tool:** Maven
- **Other Tools:** IntelliJ, Git, GitHub

---

## ✨ Features

- ✅ User Registration & Login (Spring Security)
- ✅ Role-based access control
- ✅ CRUD operations for Products
- ✅ Product categorization (e.g., Food, Drinks, Household, Other)
- ✅ Dynamic UI: Shows total sum of products by category
- ✅ Database seeding with initial categories and demo data
- ✅ Responsive Thymeleaf templates for core views
- ✅ REST-friendly layered architecture (Entities, DTOs, Services, Repositories)

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL (or use H2 for development)

### Installation

```bash
# Clone the repository
git clone https://github.com/NikiRaykov/Shopping-List-App.git

# Navigate into the project
cd shopping-list

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run

**Database Configuration**
Update your application.properties for MySQL:
spring.datasource.url=jdbc:mysql://localhost:3306/shopping_list
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

🧪 Test Credentials
You can use the following credentials after DB seed:

Username: user@example.com
Password: password123 (Change based on your seed config)

📁 Project Structure
shopping-list/
├── config/             # Spring Configuration files
├── controller/         # Web controllers (MVC)
├── entity/             # JPA entities
├── model/              # DTOs and view models
├── repository/         # Spring Data JPA repositories
├── service/            # Business logic layer
├── templates/          # Thymeleaf HTML templates
└── resources/          # Application config and static assets

🤝 Contributing
This is a solo learning project, but feedback and pull requests are welcome if you’re reviewing it.

📜 License
This project is for educational and portfolio purposes. Not licensed for commercial use.

🙋‍♂️ About the Developer
👋 I'm Niki Raykov, a junior backend developer transitioning from hospitality to tech.

🔗 LinkedIn
🌐 Portfolio
📬 Contact: nikiraiikov@gmail.com
