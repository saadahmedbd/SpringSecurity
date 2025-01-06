# SpringSecurity

What is spring security?

=>Spring Security is a powerful framework within the Spring Framework that provides authentication, authorization, and protection against common security vulnerabilities in Java applications.

Key Features of Spring Security:

1.Authentication - Verifies the identity of users (e.g., username and password).

2.Authorization - Determines what actions or resources a user is allowed to access based on roles or permissions.

3.Session Management - Handles user sessions securely, preventing session hijacking.

4.Protection Against Attacks - Provides defenses against CSRF (Cross-Site Request Forgery), XSS (Cross-Site Scripting), and SQL Injection attacks.

5.Method-Level Security - Allows securing methods using annotations like @PreAuthorize and @Secured.

6.Password Encryption - Supports password hashing and encryption for secure storage and verification.

7.Integration with OAuth2 and JWT - Easily integrates with modern security protocols like OAuth2 and JSON Web Tokens (JWT).

8.Custom Security Rules - Allows defining custom authentication and authorization logic.

9.Enterprise-Grade Security

.Suitable for large-scale enterprise applications requiring role-based access control and multi-factor authentication.

.Simplifies security integration in microservices and cloud-native applications

Example Use Case

Imagine a banking application that requires:

Login with username and password

Two-factor authentication (2FA)

Role-based access (Admin vs User)

Protection against CSRF and XSS attacks

Spring Security can handle all these requirements efficiently with minimal custom code.

Different Between Jwt and Oauth?

💕Oauth:

1.An authorization framework used for delegated access to resources without sharing credentials.

2.Suitable for third-party logins (e.g., "Sign in with Google").

3.Can use JWT or opaque tokens for access.

4.Stateful—requires a central server to validate tokens.

5.Supports scopes to limit access permissions.

6.Ideal for access control in distributed systems.

7.Tokens can be revoked or invalidated by the server.

8.More complex setup with multi-step authorization flows.

❤️JWT:

1.A token format used for authentication and data exchange between parties.

2.Stateless—does not require a central server for validation.

3.Contains claims (user data, roles, expiration) inside the token.

4.Tokens are self-contained and can be validated locally.

5.Cannot be revoked once issued, relying instead on short expiration times.

6.Simpler and faster for microservices and API-to-API communication.

7.Best suited for authentication in systems that do not need session storage.

Summary: OAuth is an authorization framework, and JWT is a data format often used within OAuth or independently for authentication and stateless communication
