package example.configuration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InfoTest {
    @Autowired
    private Info info;

    @Value("${info.address}")
    private String address;

    @Test
    public void testInfo() {
        String name = info.getName();

        Assert.assertEquals("randy", name);
        Assert.assertEquals("xxxx@gmail.com", address);
    }
}
