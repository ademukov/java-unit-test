@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Возраст должен быть 18 лет и более", true, isAdult);// Напиши код здесь
}
