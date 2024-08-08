# E-commerce Domain Hybrid Automation Framework

## Overview

The E-commerce Domain Hybrid Automation Framework is crafted to enhance the automated testing process for e-commerce platforms. Leveraging TestNG and Maven, this framework supports cross-browser testing and parallel execution to ensure your application performs reliably across different environments.

<img src="https://github.com/user-attachments/assets/7fcca594-28ad-4f64-b0f1-807564fa0496" width="80%" height="50%"  alt="image" align="center">

## Features

- **Cross-browser Testing**: Validate application functionality across multiple browsers.
- **Parallel Execution**: Execute tests concurrently to speed up the testing process.
- **Detailed Logging**: Obtain comprehensive logs for thorough debugging and analysis.
- **Modular Architecture**: Simplify extension and maintenance of the framework.

## Prerequisites

- **Java**: JDK 1.8 or higher
- **Maven**: 3.6.3 or higher
- **TestNG**: Integrated within Maven
- **Browsers**: Chrome, Firefox (additional browsers can be configured)

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/atharvjuwekar/e-commerce-domain-hybrid-automation-framework.git
   cd e-commerce-domain-hybrid-automation-framework

2. **Install dependencies**:
    ```bash
    mvn clean install

3. **Configure Browsers**:
   - Modify src/main/resources/config.properties to set up your browser preferences.
   - Example configuration:
   ```properties
   browser=chrome
## Running Tests
**Single Test**
  ```bash
  mvn test -DsuiteXmlFile=singleTest.xml
  ```
**Parallel Tests**
  ```bash
  mvn test -DsuiteXmlFile=parallelTest.xml
  ```
**Cross-browser Tests**
  ```bash
  mvn test -DsuiteXmlFile=crossBrowserTest.xml
  ```
## Project Structure
e-commerce-domain-hybrid-automation-framework/  
│  
├── .settings/                # IDE specific settings  
├── logs/                     # Log files  
├── src/  
│   ├── main/  
│   │   └── java/             # Source code  
│   └── test/  
│       └── java/             # Test source files  
├── target/                   # Compiled classes and build outputs  
├── test-output/              # Test results  
├── .classpath                # Eclipse classpath file  
├── .gitignore                # Git ignore file  
├── .project                  # Eclipse project file  
├── crossBrowserTest.xml      # Cross-browser TestNG suite  
├── master.xml                # Master TestNG suite  
├── parallelTest.xml          # Parallel TestNG suite  
└── pom.xml                   # Maven project file  
## Contributing
We welcome contributions to improve the framework. Please adhere to the following steps:  

1. Fork the repository.
2. Create a new branch (git checkout -b feature-branch).
3. Commit your changes (git commit -m 'Add new feature').
4. Push to the branch (git push origin feature-branch).
5. Open a Pull Request.

## Contact
Got questions, feedback, or just want to chat about all things tech? I'm all ears!  
Feel free to reach out through any of the following channels:  
📧 Email: [here](atharvjuwekar.aj@gmail.com) – Drop me a line anytime!  
🌐 LinkedIn: [atharvjuwekar](https://linkedin.com/in/atharvjuwekar) – Connect with me for networking and professional insights.  

Looking forward to hearing from you!




