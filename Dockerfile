
# Use an official Selenium base image
FROM selenium/standalone-chrome:latest

# Set the working directory to /workspace
WORKDIR /workspace

# Copy the project files into the container at /workspace
COPY . .

# Install Maven
RUN sudo apt-get update && \
    sudo apt-get install -y maven

# Run Maven clean and test
CMD ["mvn", "clean", "test"]
