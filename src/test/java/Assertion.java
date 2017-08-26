	String expected = "Facebook";

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");

	String text = driver.getText();

	Assert.assertEquals("expected, text", "Title msg not verified");
	System.out.println("title is verified");
	driver.close();
