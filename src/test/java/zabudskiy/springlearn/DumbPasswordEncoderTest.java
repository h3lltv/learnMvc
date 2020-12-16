package zabudskiy.springlearn;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DumbPasswordEncoderTest {

    @Test
    void encode() {
        DumbPasswordEncoder encoder = new DumbPasswordEncoder();

        Assert.assertEquals("secret: 'mypwd'", encoder.encode("mypwd"));
        Assert.assertThat(encoder.encode("mypwd"), Matchers.containsString("mypwd"));
    }

}