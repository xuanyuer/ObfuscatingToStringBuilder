package com.xyer.common.utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions
(
    features = "classpath:com/xyer/common/utils/obfuscatingToStringBuilder.feature"
)
public class ObfuscatingToStringBuilderTest
{

}