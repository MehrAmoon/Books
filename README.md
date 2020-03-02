A simple Android application project using MVVM , dagger , Retrofit , RxJava, DataBinding 
I chose these libraries because:

# MVVM architecture
MVVM separates your view (i.e. Activities and Fragments) from your business logic. MVVM is enough for small projects, but when your codebase becomes huge, your ViewModels start bloating. Separating responsibilities becomes hard.

# Dagger2 DI
There are several benefits from using dependency injection containers rather than having components satisfy their own dependencies. Some of these benefits are:
Reduced Dependencies
Reduced Dependency Carrying
More Reusable Code
More Testable Code
More Readable Code

# Retrofit 2.x as REST client
Retrofit is a REST Client for Java, Android, Kotlin. It makes it relatively easy to retrieve and upload JSON (or other structured data) via a REST based webservice. In Retrofit you configure which converter is used for the data serialization. Typically for JSON you use GSon, but you can add custom converters to process XML or other protocols. Retrofit uses the OkHttp library for HTTP requests.

# RxJava
RxJava is just Java implementation of an API for asynchronous programming with observable streams, reactivex. Actually, it is mix of three concepts: the Observer pattern, the Iterator pattern and functional programming. There are libraries for other programming languages: RxSwift, RxNet, RxJs…

# Architecture Components
Architecture Components is a new library by Google that has the aim to help us design application that are “robust, testable, and maintainable”. In a nutshell, this library helps us to better handle the persisting of data across lifecycle events and configuration changes, whilst also helping us to create a better architecture application and avoid bloated classes that are difficult to maintain and test.

# Android Jetpack
Jetpack is a suite of libraries, tools, and guidance to help developers write high-quality apps easier. These components help you follow best practices, free you from writing boilerplate code, and simplify complex tasks, so you can focus on the code you care about.
Jetpack comprises the androidx.* package libraries, unbundled from the platform APIs. This means that it offers backward compatibility and is updated more frequently than the Android platform, making sure you always have access to the latest and greatest versions of the Jetpack components.
 
# Data Binding Library   
The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically. Layouts are often defined in activities with code that calls UI framework methods.

# Glide
Glide is a fast and efficient image loading library for Android focused on smooth scrolling. Glide offers an easy to use API, a performant and extensible resource decoding pipeline and automatic resource pooling. Glide supports fetching, decoding, and displaying video stills, images, and animated GIFs.
