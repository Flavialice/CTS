package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AvionSetTest.class, AvionTest.class, ZborTest.class,
	ZborSetTest.class, AdresaTest.class, AdresaSetTest.class,
	ClientTest.class, ClientSetTest.class, PlataTest.class})
public class AllTests {

}
