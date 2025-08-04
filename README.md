# 🌿 Herbal Encyclopedia

A comprehensive digital encyclopedia of medicinal herbs and plants, built with Spring Boot and modern web technologies. This application allows users to explore, search, and manage information about various medicinal plants and their uses.

Website - https://grootherbfrontend.vercel.app/ - made by Shankar Yadav

## 🚀 Features

- 📚 Browse a comprehensive database of medicinal herbs
- 🔍 Search functionality for quick herb lookup (to be implemented)
- 📝 Add and manage herb information
- 📊 Detailed herb profiles with images and descriptions
- 🔄 RESTful API for integration with other applications

## 🛠️ Technologies Used

- **Backend**: 
  - Java 21
  - Spring Boot 3.5.3
  - Spring Data JPA
  - Hibernate
  - Maven

- **Database**:
  - H2 (Development)
  - MySQL (Production-ready)

- **Tools**:
  - Spring Boot DevTools
  - Lombok
  - ModelMapper

## 🚀 Getting Started

### Prerequisites

- Java 21 or later
- Maven 3.6.0 or later
- MySQL 8.0+ (for production)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/HerbalEncyclopedia.git
   cd HerbalEncyclopedia
   ```

2. **Configure Database**
   - For development, H2 database is configured by default
   - For production, update `application.properties` with your PostgreSQL credentials

3. **Build and Run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the Application**
   - Open your browser and navigate to `http://localhost:8080`

## 📚 API Documentation

Explore the API using the following endpoints:

- `GET /api/herb/allherbnames` - Get all herbs
- `GET /api/herb/{id}` - Get herb by ID
- `POST /api/herb/addherb` - Add a new herb
- `GET /api/herb/slideshow` - Get a slideshow of herbs
- `PUT /api/herb/{id}` - Update herb information (To be implemented)
- `DELETE /api/herb/{id}` - Delete a herb (To be implemented)

For detailed API documentation, import the Postman collection from `HerbAPI.postman_collection.json`

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

## 📧 Contact

Your Name - Azad 
Email - azadmuk011098@example.com

Project Link: [https://github.com/yourusername/HerbalEncyclopedia](https://github.com/yourusername/HerbalEncyclopedia)

## 🙏 Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Bootstrap](https://getbootstrap.com)
- [Font Awesome](https://fontawesome.com/)
- [Open Source Icons](https://icons8.com/)

---

<div align="center">
  Made with ❤️ using Spring Boot & Open Source
</div>
