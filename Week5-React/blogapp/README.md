# React Component Lifecycle – Blog Application

## Aim

To develop a React application that demonstrates the Component Lifecycle by fetching blog posts using the Fetch API and displaying them using Class Components.

---

# Objectives

- Explain the need and benefits of Component Lifecycle.
- Identify various Lifecycle Hook Methods.
- List the sequence of rendering a Component.
- Implement componentDidMount().
- Implement componentDidCatch().

---

# Introduction

React is a JavaScript library used for developing modern web applications.

React applications are built using Components.

Every component goes through different phases during its lifetime.

These phases are known as the Component Lifecycle.

Lifecycle methods allow developers to execute code at different stages such as when a component is created, updated, or removed.

In this experiment, the blog posts are fetched from an online REST API using componentDidMount() and displayed on the webpage.

---

# Theory

## React Component Lifecycle

Every React component passes through different stages called the Component Lifecycle.

These stages are:

- Mounting
- Updating
- Unmounting
- Error Handling

Lifecycle methods allow React developers to perform different operations during these stages.

---

## Need for Lifecycle Methods

Lifecycle methods are required because they help developers

- Fetch data from servers
- Update user interface
- Handle errors
- Improve application performance
- Clean up resources

---

## Benefits of Lifecycle Methods

- Better control over components
- Easier data fetching
- Better error handling
- Improved code organization
- Efficient rendering

---

## Lifecycle Hook Methods

Some important lifecycle methods are

### constructor()

Initializes the component.

---

### render()

Returns JSX to display the UI.

---

### componentDidMount()

Called after the component is displayed.

Mostly used for

- API calls
- Fetch requests
- Database operations

---

### componentDidUpdate()

Runs whenever component state changes.

---

### componentWillUnmount()

Runs before removing the component.

---

### componentDidCatch()

Handles runtime errors inside child components.

---

# Rendering Sequence

The rendering sequence followed in this application is

1. Constructor executes.
2. Render method executes.
3. Component appears on browser.
4. componentDidMount() executes.
5. Fetch API retrieves posts.
6. State updates.
7. Render executes again.
8. Posts appear on screen.

---

# Program Description

The application consists of

- Post.js
- Posts.js
- App.js

The Posts component loads blog posts from

https://jsonplaceholder.typicode.com/posts

using Fetch API.

The received JSON data is converted into Post objects and stored in the component state.

Finally, render() displays each title and body.

If any error occurs, componentDidCatch() displays an alert.

---

# Result

The application successfully

- Fetches posts from REST API.
- Displays title and body.
- Demonstrates componentDidMount().
- Demonstrates componentDidCatch().
- Uses React Class Components.

---

# Conclusion

This experiment helped me understand React Component Lifecycle methods. I learned how to use componentDidMount() to fetch data after rendering a component and how componentDidCatch() handles runtime errors. The experiment also improved my understanding of Class Components, state management, API integration, and lifecycle hooks.
