package com.example.androidtest;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.androidtest.SimpleActivityTest \
 * com.example.androidtest.tests/android.test.InstrumentationTestRunner
 */
public class SimpleActivityTest extends ActivityInstrumentationTestCase2<SimpleActivity> {

	private SimpleActivity mActivity;
	
    public SimpleActivityTest() {
        super("com.example.androidtest", SimpleActivity.class);
    }
    
    @Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = getActivity();
	}

	public void testAddValues() {
		assertTrue("Add result should be 98", mActivity.add(2, 3) == 5);
	}
	
	public void testAddValues2() {
		assertTrue("Add result should be 98", mActivity.add(3, 3) == 6);
	}

}
