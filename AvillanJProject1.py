class SampleClass:
    """
    A sample Python class to demonstrate class creation, documentation,
    and method implementation.
    """

    def __init__(self, name, value):
        """
        Initializes a new instance of the SampleClass.

        Args:
            name (str): The name associated with the instance.
            value (int): The initial value for the instance.
        """
        self.name = name
        self.value = value

    def display_info(self):
        """
        Prints the information of the instance, including name and value.
        """
        print(f"Name: {self.name}, Value: {self.value}")

    def update_value(self, new_value):
        """
        Updates the value of the instance.

        Args:
            new_value (int): The new value to be set.
        """
        self.value = new_value

    def reset_value(self):
        """
        Resets the value of the instance to 0.
        """
        self.value = 0

