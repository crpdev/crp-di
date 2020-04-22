# crp-di
Dependency Injection Concepts

`April 19, 2020`

# Three ways to inject dependencies

- Property Based Injection
- Setter Based Injection
- Constructor Based Injection [Preferred]

# Qualifiers

- When there are different implementations of an Interface, Qualifier annotation can be used to specify the Implementation to be used

# Primary

- An Implementation can be marked with Primary annotation when a default implementation needs to be imposed at runtime. However, Qualifier takes the higher hand if used.

# Profiles

- A spring boot application used a "default" profile during startup
- Custom profiles can be marked in the implementations using the Profile annotation
- This ensures the implementation matching the profile defined in "application.properties/ yaml" is injected at runtime.

                                                                    Happy Learning!
                                                              Last Updated: April 21, 2020
