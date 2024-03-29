<!-- Project SampleAWSLambdaFunction -->
<!--
*** This README uses markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![Apache License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
<!--
  <a href="https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction">
    <img src="images/logo.png" alt="Logo" width="120" height="120">
  </a>
-->

  <h3 align="center">SampleAWSLambdaFunction</h3>

  <p align="center">
    Sample AWS Lambda Function backend
    <br />
    <!--<a href=""><strong>Explore the docs »</strong></a>-->
    <br />
    <br />
    <!--<a href="https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction">View Demo</a>-->
    <a href="https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction/issues">Report Bug</a>
    ·
    <a href="https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction/issues">Request Feature</a>
  </p>
</p>

<!-- TABLE OF CONTENTS -->

## Table of Contents
- [About the Project](#about-the-project)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

<!-- ABOUT THE PROJECT -->


## About The Project

This project is a code-base template that can be used in an AWS Lambda function and customized to your liking.

<!--
[![Product Name Screen Shot][product-screenshot]](https://example.com)
-->

<!--
A project to analyze the tags present in StackOverflow and find out the trends and
patterns associated with them. In addition to that, predicting future trends using Machine
Learning.
-->

<!-- GETTING STARTED -->

## Getting Started

1. Fork and clone the project
2. Run `mvn package` in the root directory
3. Upload the jar generated in the target directory to AWS Lambda
4. Change the value in the Handler field as follows:
   - For the Name app: 
    ```text
    com.sanjula.wso2.nameapp.FunctionHandler::handleRequest
    ```
   - For the Marketplace app:
     - For the Search Function:
     ```text
     com.sanjula.wso2.marketplaceapp.searchFunction.SearchHandler::handleRequest  
     ```
5. Configure a test based on Hello World template
6. Provide a useful name to the test
7. Insert the following as the input:
   - For the Name app:
    ```json
    {
        "name": "Sanjula"
    }
    ```
   - For the Marketplace app:
     - For the Search Function:
       ```json
       {
           "searchTerm": "Smartwatch"
       }
       ```
8. Now save the changes and click on the Test button or execute the function from another application.

<!-- CONTRIBUTING -->

## Contributing

Contributions make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are appreciated.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/NewFeature`)
3. Commit your Changes (`git commit -m 'Add some NewFeature'`)
4. Push to the Branch (`git push origin feature/NewFeature`)
5. Open a Pull Request

<!-- LICENSE -->

## License

Distributed under the Apache License 2.0. See `LICENSE` for more information.

<!-- CONTACT -->

## Contact

Sanjula Madurapperuma - [@s_arachchige](https://twitter.com/s_arachchige) - [Medium](https://medium.com/@sanjulamadurapperuma)

Project Link: [https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction](https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction)

<!-- MARKDOWN LINKS & IMAGES -->

[contributors-shield]: https://img.shields.io/github/contributors/sanjulamadurapperuma/SampleAWSLambdaFunction.svg?style=flat-square
[contributors-url]: https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/sanjulamadurapperuma/SampleAWSLambdaFunction.svg?style=flat-square
[forks-url]: https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction/network/members
[stars-shield]: https://img.shields.io/github/stars/sanjulamadurapperuma/SampleAWSLambdaFunction.svg?style=flat-square
[stars-url]: https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction/stargazers
[issues-shield]: https://img.shields.io/github/issues/sanjulamadurapperuma/SampleAWSLambdaFunction.svg?style=flat-square
[issues-url]: https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction/issues
[license-shield]: https://img.shields.io/github/license/sanjulamadurapperuma/SampleAWSLambdaFunction.svg?style=flat-square
[license-url]: https://github.com/sanjulamadurapperuma/SampleAWSLambdaFunction/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/sanjula-madurapperuma/
