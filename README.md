# EcommerceConsole
# Project Overview: 
The E-commerce application is a Java-based system designed to facilitate online transactions, connecting vendors offering diverse products with customers seeking a convenient and interactive shopping experience. The project encompasses a range of classes, including Admin, AdminManager, Customer, Discount, EcommercialMain, and various product categories like Beauty_HealthFashion, ComputerScience, GamesToys, and Gaming.


# Purpose: 
The primary purpose of the project is to create an efficient and user-friendly E-commerce platform. Vendors can manage their products, customers can explore, add items to their shopping carts, and admins oversee product management. The system also incorporates features such as discounts, order processing, and customer reviews.


# Users: 
The project caters to three main user roles: Vendors, Customers, and Admins. Vendors are responsible for adding, updating, and removing their products. Customers can browse products, add them to their shopping carts, and place orders. Admins, on the other hand, manage the overall platform, including user accounts, product listings, and system functionalities.

# User Interaction:
Customers interact with the system by signing up, logging in, and navigating through product categories. They can search for products, view details, add items to their shopping carts, and place orders. Vendors interact by adding their products, setting quantities and prices, and potentially offering discounts. Admins oversee and manage the entire system, ensuring smooth operations and resolving issues.

# Vendor's Product Management:
Vendors play a crucial role in managing their product listings. They can add new products, update existing ones, and remove items from the inventory. This functionality ensures that vendors have control over their offerings within the E-commerce platform.
# Interaction of Customer with Products:
Customers engage with the platform by exploring product categories, searching for specific items, and adding desired products to their shopping carts. The system provides options for viewing detailed product information, applying discounts, and completing orders, providing a seamless experience for users.

# Admin Role in Product Management:
Admins have a pivotal role in overseeing and managing the E-commerce platform. They can monitor user accounts, address authentication, and play a crucial role in maintaining the integrity of the system. Admins also have the ability to add other admins, ensuring a secure and well-regulated environment. They manage product categories, oversee vendor activities, and intervene if issues arise, contributing to the overall efficiency and security of the platform.

# Description of classes : 
# Admin Class:
The Admin class manages administrator accounts and their interactions with the system. Admins can set up their credentials, sign in, and have access to an admin menu for tasks like adding, removing, updating, and displaying products.
# AdminManager Class:
The AdminManager class is responsible for maintaining a collection of admin accounts, ensuring organized administration within the system.
# Beauty_HealthFashion Class:
The Beauty_HealthFashion class represents a category of products related to beauty, health, and fashion. It inherits from the Product class, providing a specific product type within the platform.
# Customer Class:
The Customer class represents customer accounts and their interactions. It manages customer authentication, shopping carts, and provides methods for exploring and interacting with products.
# Customer Class:
The Customer class represents customer accounts and their interactions. It manages customer authentication, shopping carts, and provides methods for exploring and interacting with products.
# Inventory Class:
The Inventory class manages the overall stock of products available in the E-commerce platform. It includes methods for adding, removing, updating, and displaying products.
# PaymentProcessor Class:
The PaymentProcessor class handles payment-related operations within the system. It includes functionality for processing payments and generating payment receipts.
# Product Class:
The Product class serves as a generic representation for various types of products available in the E-commerce platform. It includes essential attributes like ID, name, price, and quantity.

# ProductReview Class:
The ProductReview class manages customer reviews for products. It includes methods for adding and displaying reviews, contributing to customer feedback.

# ShoppingCart Class:
The ShoppingCart class represents the shopping cart functionality for customers. It includes methods for adding, updating, and displaying products in the cart.
# EcommercialMain Class:
The EcommercialMain class serves as the main entry point for running the E-commerce application. It orchestrates user authentication, navigation between admin and customer functionalities, and the overall functioning of the system.
