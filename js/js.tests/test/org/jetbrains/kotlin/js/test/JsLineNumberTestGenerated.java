/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/lineNumbers")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JsLineNumberTestGenerated extends AbstractJsLineNumberTest {
    public void testAllFilesPresentInLineNumbers() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/lineNumbers"), Pattern.compile("^([^_](.+))\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("catch.kt")
    public void testCatch() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/catch.kt");
        doTest(fileName);
    }

    @TestMetadata("chainedCall.kt")
    public void testChainedCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/chainedCall.kt");
        doTest(fileName);
    }

    @TestMetadata("closure.kt")
    public void testClosure() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/closure.kt");
        doTest(fileName);
    }

    @TestMetadata("coroutine.kt")
    public void testCoroutine() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/coroutine.kt");
        doTest(fileName);
    }

    @TestMetadata("delegateMemberVal.kt")
    public void testDelegateMemberVal() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/delegateMemberVal.kt");
        doTest(fileName);
    }

    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/for.kt");
        doTest(fileName);
    }

    @TestMetadata("increment.kt")
    public void testIncrement() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/increment.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineLocalVarsRef.kt")
    public void testInlineLocalVarsRef() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/inlineLocalVarsRef.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineReturn.kt")
    public void testInlineReturn() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/inlineReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("inlining.kt")
    public void testInlining() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/inlining.kt");
        doTest(fileName);
    }

    @TestMetadata("inliningWithLambda.kt")
    public void testInliningWithLambda() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/inliningWithLambda.kt");
        doTest(fileName);
    }

    @TestMetadata("lambdaWithClosure.kt")
    public void testLambdaWithClosure() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/lambdaWithClosure.kt");
        doTest(fileName);
    }

    @TestMetadata("longLiteral.kt")
    public void testLongLiteral() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/longLiteral.kt");
        doTest(fileName);
    }

    @TestMetadata("memberFunWithDefaultParam.kt")
    public void testMemberFunWithDefaultParam() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/memberFunWithDefaultParam.kt");
        doTest(fileName);
    }

    @TestMetadata("multipleReferences.kt")
    public void testMultipleReferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/multipleReferences.kt");
        doTest(fileName);
    }

    @TestMetadata("objectInstanceFunction.kt")
    public void testObjectInstanceFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/objectInstanceFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("optionalArgs.kt")
    public void testOptionalArgs() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/optionalArgs.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/simple.kt");
        doTest(fileName);
    }

    @TestMetadata("stringLiteral.kt")
    public void testStringLiteral() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/stringLiteral.kt");
        doTest(fileName);
    }

    @TestMetadata("syntheticCodeInConstructors.kt")
    public void testSyntheticCodeInConstructors() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/syntheticCodeInConstructors.kt");
        doTest(fileName);
    }

    @TestMetadata("syntheticCodeInEnums.kt")
    public void testSyntheticCodeInEnums() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/syntheticCodeInEnums.kt");
        doTest(fileName);
    }

    @TestMetadata("valParameter.kt")
    public void testValParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/valParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("whenIn.kt")
    public void testWhenIn() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/whenIn.kt");
        doTest(fileName);
    }

    @TestMetadata("whenIs.kt")
    public void testWhenIs() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/lineNumbers/whenIs.kt");
        doTest(fileName);
    }
}
