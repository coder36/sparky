package coder36;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class HelperTest {

    Helper helper;

    @Before
    public void init() {
        helper = new Helper();
    }

    @Test
    public void test_niceDate_converts_26_Jan() {
        assertThat( helper.niceDate("2015-01-26"), is(equalTo("26 Jan")) );
    }

    @Test
    public void test_niceDate_converts_10_Dec() {
        assertThat( helper.niceDate("2015-12-10"), is(equalTo("10 Dec")) );
    }

}
