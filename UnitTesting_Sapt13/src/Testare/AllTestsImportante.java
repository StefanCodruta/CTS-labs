package Testare;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TesteCategorii.TestImportant;

@RunWith(Categories.class)
@IncludeCategory({TestImportant.class})
@SuiteClasses({ TestStudent.class, TestStudent2.class })
public class AllTestsImportante {

}
