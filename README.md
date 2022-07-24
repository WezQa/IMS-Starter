Coverage: 62.1%
IMS Starter

I was given the task to create a Inventory Manangement System, which a user would interact with using a Command-Line Interface (CLI).  The user would require CRUD functionality over serval fields including, Customers, Orders and Items.

## Getting Started

Forked the project from github. Cloned the repo containing the project files to provide me with access on my local machine.

### Prerequisites

I had to install Eclispe, which is what I used as my IDE for Java.  Alongside this there were also installs for maven and a mysql editor, this would allow my Eclispe IDE to interface with the database I would create.

To create the database I installed MySQL.

I would also need a GitHub account to push my work to.

I created a Trello account to use as a project management tool, acting as my own project manager it would be a good way to update and keep track of my progress.

### Installing

To install Eclispe

The fisrt step is go to https://www.eclipse.org/downloads/ and download the latest version.
```
Open the download and run the install wizard, once completed open Eclipse
```
To install Mysql

Then go to https://dev.mysql.com/downloads/workbench/ and download the latest version.
```
Open the download and run the install wizard, once completed open MySql

Once the IMS repo has been cloned to your local machine, having eclipse open you can open and import the project in to begin work.  Once done open the runner class and run using f11 to bring up the interface in the terminal and you can see what you have to work with.

## Running the tests

I used Junit tests to run all tests and also mockito is some areas.

### Unit Tests

I caried out testing on the DAO methods as well was other areas of the code.  This was to make sure that the crud functionality is working as intended, as this is what the user required.

```
@Test
	public void testCreate() {
		final Customer created = new Customer(4L, "Chris", "Redfield");
		assertEquals(created, DAO.create(created));
	}
```

### Integration Tests 

I used Mockito integration testing, this allows me to test if the controller is working for each object and each method called in the controller.

```
@Test
	public void testCreate() {
		final String Item = "Sock", Price = "30";
		final Item created = new Item(Item, Price);

		Mockito.when(utils.getString()).thenReturn(Item, Price);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}
```
## Deployment

Run maven clean package to make a new .jar file if any changes was made to the code.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

Westley Defoe

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

Ed Reynolds
Andrew McCall
Jordan Harrison
