Ability to import .csv file in the phd system. So, that user needn't to manual fill every entry.

This is an extension to project.

Here, we are converting data of .csv file that contains data from applicants who have applied for PhD program to our applucation specific format.

Added a functionality to import the applicant data from the provided file and store it at the backend- in the format we have used to maintain the applicants’ data in my project. So instead of filling a form for every applicant, there is an additional functionality to simply import the csv into your database such that it is ready to apply filters to it.

I hadn't designed any GUI for that.I Simply defined a class with appropriate functions to parse the csv and create the data to be used by the admin to apply filters.