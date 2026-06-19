# Quantity Measurement Application - Consolidated Documentation



---
# Quantity Measurement App Development Methodology(1)

Quantity
Measurement
App
Development
Methodology
App Development
Methodology
The approach used to build the
Quantity Measurement App will be
a hybrid of the Test Driven
Development (TDD) Methodology
and the traditional Design-Develop-
Test (DTT) Methodology. Let's do a
brief drive down to TDD
methodology. Test-Driven
Development (TDD) is a software
development process that flips
traditional coding (i.e. DDT which
is  Design-Develop-Test) on its
head. Instead of writing code and
then checking if it works, you write
a test that defines what the code
should do before the code even
exists.
Why Use TDD?
While it might feel like it takes
longer upfront, TDD offers several
long-term benefits:.
Published using Google Docs Report abuse Learn more
Quantity Measurement App Development Methodology Updated automatically every 5
minutes
19/06/2026, 08:32 Quantity Measurement App Development Methodology
https://docs.google.com/document/d/e/2PACX-1vRNxvB5Z_vO_r7JZY0SrYhB0pimqe3Ch0ByaifVTUV-TR00rJCsiy7AiqtMpNF28DrFs2KHJ6gPE5… 1/6
1. Cleaner Design –  It
forces you to think about
the interface and usage of
your code before you get
bogged down in
implementation details.
2. High Test Coverage  –
 Since every line of code is
written in response to a test,
you naturally end up with a
comprehensive suite of tests
3. Confidence to Change –
 Want to update an old
module? If you have a solid
TDD suite, you’ll know
within seconds if your
changes broke something
elsewhere.
4. Documentation – The tests
themselves serve as live
documentation, showing
other developers exactly
how the code is intended to
be used.
TDD vs. Traditional
Development
Feature Traditional
Development
Test-Driven
Development
When to
test?
After the
code is
written.
Before the
code is
written.
Goal Find bugs in
existing code.
Guide the
design and
logic.
Focus Error
detection and
validation.
Requirement
fulfillment.
Refactoring Risky; might
break
untested
parts.
Safe;
protected by
the "Green"
state.
Published using Google Docs Report abuse Learn more
Quantity Measurement App Development Methodology Updated automatically every 5
minutes
19/06/2026, 08:32 Quantity Measurement App Development Methodology
https://docs.google.com/document/d/e/2PACX-1vRNxvB5Z_vO_r7JZY0SrYhB0pimqe3Ch0ByaifVTUV-TR00rJCsiy7AiqtMpNF28DrFs2KHJ6gPE5… 2/6
TDD vs Traditional
Design, Development,
and Test Method
Think of the standard Design →
Development →  Test flow as a
"macro" approach, while TDD is a
"micro" approach that happens
entirely within the development
phase.
Traditional: The
"Waterfall" or "V-Model"
Mental Flow
1. Design – You plan the
architecture and logic on
paper or diagrams.
2. Development – You write
the entire feature or module
based on that design.
3. Test – You hand the
finished code to a QA team
or run a test suite to see if it
works.
TDD: The "Evolutionary"
Mental Flow
1. Test/Design – You write a
test, which acts as a "mini-
design" document.
2. Development – You write
just enough code to pass.
3. Design (Refactor) – You
improve the design of the
code you just wrote.
Comparison Table
Feature DDT (Design-Dev-
Test - Traditional)
TDD (Test-
Driven)
Published using Google Docs Report abuse Learn more
Quantity Measurement App Development Methodology Updated automatically every 5
minutes
19/06/2026, 08:32 Quantity Measurement App Development Methodology
https://docs.google.com/document/d/e/2PACX-1vRNxvB5Z_vO_r7JZY0SrYhB0pimqe3Ch0ByaifVTUV-TR00rJCsiy7AiqtMpNF28DrFs2KHJ6gPE5… 3/6
Feature DDT (Design-Dev-
Test - Traditional)
TDD (Test-
Driven)
Feedback
Loop
Long. You find out if
a design failed days
or weeks later.
Instant. You
find out if a
design failed
within
seconds.
Code
Purpose
Code is written to
fulfill a specification
document.
Code is
written to
make a failing
test pass.
Role of
Testing
Verification. Proving
the code does what
you already wrote.
Design
Tool. Defining
what the code
should do
before it
exists.
Debugging Often involves heavy
"stepping through"
code to find bugs.
Minimal. If a
test fails, it's
usually in the
code you
wrote 30
seconds ago.
Flexibility High "sunk cost."
Changing code late
in the cycle is
expensive.
Low friction.
Refactoring is
an intentional,
built-in step.
Our Development
Approach will have DDT
and TDD coexist
TDD doesn't actually replace high-
level design; it replaces the
implementation habit.
1. System Design – You still
need to decide if you're
using a microservices
architecture, what your
database schema looks like,
and how your API will be
structured. TDD won't do
that for you.
2. The TDD Layer – Once the
high-level design is set, you
use TDD to build the
individual components.
Published using Google Docs Report abuse Learn more
Quantity Measurement App Development Methodology Updated automatically every 5
minutes
19/06/2026, 08:32 Quantity Measurement App Development Methodology
https://docs.google.com/document/d/e/2PACX-1vRNxvB5Z_vO_r7JZY0SrYhB0pimqe3Ch0ByaifVTUV-TR00rJCsiy7AiqtMpNF28DrFs2KHJ6gPE5… 4/6
3. Final Testing – Even with
TDD, you still need
traditional "Integration" and
"User Acceptance Testing"
(UAT) to ensure the whole
system works together in a
real-world environment.
Development Approach
1. Start Simple – Begin with
basic equality checks for a
single quantity type
2. Incremental Complexity –
 Add new quantity types
and conversion features as
use cases require
3. Scope Discipline – Each
use case defines its
boundaries; resist adding
features outside the current
scope
4. Full Stack – Develop both
frontend and backend
capabilities as needed by
the use case
5. DDT & TDD Approach –
We will use a combination
of Design-Develop-Test
(DDT) and Test Driven
Development Approach to
develop the Object Model,
Implement and Write
comprehensive test cases
implementing features to
ensure 100% code
coverage. For example for
Quantity Measurement at
broad level test cases
should cover the following:
● Unit
conversions
are
mathematically
accurate
● Edge cases
and boundary
conditions
are handled
correctly
● Invalid inputs
are rejected
Published using Google Docs Report abuse Learn more
Quantity Measurement App Development Methodology Updated automatically every 5
minutes
19/06/2026, 08:32 Quantity Measurement App Development Methodology
https://docs.google.com/document/d/e/2PACX-1vRNxvB5Z_vO_r7JZY0SrYhB0pimqe3Ch0ByaifVTUV-TR00rJCsiy7AiqtMpNF28DrFs2KHJ6gPE5… 5/6
appropriately
● All code
paths are
exercised
Published using Google Docs Report abuse Learn more
Quantity Measurement App Development Methodology Updated automatically every 5
minutes
19/06/2026, 08:32 Quantity Measurement App Development Methodology
https://docs.google.com/document/d/e/2PACX-1vRNxvB5Z_vO_r7JZY0SrYhB0pimqe3Ch0ByaifVTUV-TR00rJCsiy7AiqtMpNF28DrFs2KHJ6gPE5… 6/6


---
# Quantity Measurement App GIT Workflow(1)

Quantity
Measurement
App GIT
Workflow
GIT Workflow
Guidance
1. Create a GIT Repository for
QuantityMeasyerementApp andclone the repository in the localfolder
2. Add .gitignore file to ignore and
commit to dev branch
Below is an example of a .gitignore
file for a project.
 
3. Create a feature branch for everyuse case e.g. git checkout -b
"feature/UC1-FeetEquality"
Published using Google Docs Report abuse Learn more
Quantity Measurement App GIT Workflow Updated automatically every 5
minutes
19/06/2026, 08:32 Quantity Measurement App GIT Workflow
https://docs.google.com/document/d/e/2PACX-1vSXQAbzOmtBViEWkBZid-Grn2UBNVoFx_-ZnPMhvPJusbkMIzRt-bBWfG9sBOFjtuk-IJgdJ-Hg-W… 1/2
4. After development of codecommit changes: git commit -m
"Feet measurement equality"  andPush feature branch to remote: git
push origin feature/UCx-...
5. Post that, merge the code to thedev branch.  
6. So the dev branch will have thelatest code, and the feature branch
will have all the use cases thathave been developed
7. After compilation of the project,
merge the dev branch with themain branch and sync up with theremote repository branch
Please refer the figure below for a
github branch structure beingexpected for this App
Published using Google Docs Report abuse Learn more
Quantity Measurement App GIT Workflow Updated automatically every 5
minutes
19/06/2026, 08:32 Quantity Measurement App GIT Workflow
https://docs.google.com/document/d/e/2PACX-1vSXQAbzOmtBViEWkBZid-Grn2UBNVoFx_-ZnPMhvPJusbkMIzRt-bBWfG9sBOFjtuk-IJgdJ-Hg-W… 2/2


---
# UC10_ Generic Quantity Class with Unit Interface for Multi-Category Support(1)

UC10: Generic QuantityClass with Unit Interfacefor Multi-CategorySupport
Description
UC10 addresses the architectural and designdisadvantages introduced by UC9 by refactoringthe design into a single, generic Quantity<U>class that works with any measurement categorythrough a common IMeasurable interface. Thisuse case eliminates code duplication acrossparallel QuantityLength and QuantityWeightclasses, consolidates unit enum patterns, andsimplifies the QuantityMeasurementApp class toadhere to the Single Responsibility Principle.
The refactoring maintains all functionality fromUC1–UC9 while establishing a scalable,maintainable architecture that supports seamlessaddition of new measurement categories(volume, temperature, etc.) without codeduplication.
Disadvantages of UC9Implementation
UC9 introduced several architectural flaws thatUC10 addresses:
1. Duplicate Unit Enum Structures
● LengthUnit and WeightUnit enumscontain nearly identical code:
● Same method signatures:getConversionFactor(), convertToBaseUnit(),convertFromBaseUnit()○ Same immutabilityguarantees
○ Redundant implementationpatterns● Violates DRY principle; futureunits (VolumeUnit,TemperatureUnit) would amplifyduplication.
2. Duplicate Quantity Class Logic
● QuantityLength and QuantityWeight classesare nearly identical:
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 1/27
○ Same constructorvalidation
● Identical equals() methodstructure (with different unit types)
● Duplicate convertTo() logic● Replicated add() methodimplementations
● Bug fixes or improvements mustbe applied separately to eachclass, increasing error risk.● Each new category requireswriting identical boilerplate code.
3. QuantityMeasurementApp SingleResponsibility Principle Violation
● Class handles multiple, unrelateddomains (length, weight) withseparate methods:○ demonstrateLengthEquality(),demonstrateWeightEquality()○ demonstrateLengthConversion(),demonstrateWeightConversion()○ demonstrateLengthAddition(),demonstrateWeightAddition()
● Method duplication reflectsidentical underlying logic appliedto different types.● Class becomes increasinglycomplex and harder to maintainas categories grow.● Mixed concerns: demonstrationlogic intertwined with category-specific handling.
4. Exponential Code Growth
● Adding each new unit typerequires:
○ New Unit enum (e.g.,VolumeUnit)
○ New Quantity class (e.g.,QuantityVolume)○ New demonstrationmethods inQuantityMeasurementApp(minimum 3 methods)○ New comprehensive testsuite
● Total codebase growsexponentially; maintenanceburden escalates rapidly.● Pattern becomes unsustainablebeyond 3-4 categories.
5. Inconsistency Risk
● Refactoring comparison logicin QuantityLength withoutupdating QuantityWeight createssubtle bugs.● Different categories mayinadvertently have differentprecision, rounding, or validationlogic.
● No single source of truth for coreoperations.
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 2/27
6. Limited API Flexibility
● Methods accepting Quantity<?> or generic comparisons aredifficult to implement.● Factory methods or utilityfunctions cannot work uniformlyacross categories.● The system becomes increasinglyfragmented.
Preconditions
● All functionality from UC1–UC9 is fully
operational and tested.
● An IMeasurable interface is defined to
standardize unit behavior across all
categories.
● Both LengthUnit and WeightUnit enums
are refactored to implement IMeasurable.
● A generic Quantity<U extends
IMeasurable> class is created to replace
category-specific Quantity classes.
● Type safety is maintained through
generics; compile-time checking
prevents category mismatches.
● All existing test cases from UC1–UC9
continue to pass without modification.
● The refactored design serves as a
template for future measurement
categories.
Main Flow
1. Define IMeasurable Interface
● Create interface with methods
required for unit conversions:
○ double
getConversionFactor() -
returns conversion factor
relative to base unit
○ double
convertToBaseUnit(double
value) - converts value to
base unit
○ double
convertFromBaseUnit(double
baseValue) - converts from
base unit to this unit
○ String getUnitName() -
returns readable unit name
2. Refactor LengthUnit Enum:
● Implement IMeasurable interface
● Keep all existing constants (FEET,
INCHES, YARDS, CENTIMETERS)
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 3/27
and conversion factors
● Implement all interface methods
with existing logic
● No external API changes; fully
backward compatible.
3. Refactor WeightUnit Enum:
● Implement IMeasurable interface
● Ensure same structure and
method implementations as
refactored LengthUnit
● Consistency across enums
improves maintainability
4. Create Generic Quantity Class:
● Replaces both QuantityLength and
QuantityWeight
● Holds private final fields: double
value and U unit
● Constructor validates that unit is
non-null and value is finite
● Implements equals() method:
○ Checks object identity and
null
○ Verifies unit types match
(prevents cross-category
comparison)
○ Converts both to base unit
and compares using
Double.compare()
● Implements convertTo(U
targetUnit) method:
○ Delegates to unit's
conversion methods
○ Returns
new Quantity<U> instance
(immutability)
○ Rounds result to two
decimal places
● Implements add() methods
(overloaded):
○ Add (Quantity<U> other) -
result in first operand's unit
○ Add (Quantity<U> other, U
targetUnit) - result in
specified unit
● Overrides hashCode() for
collection support
● Overrides toString() for readable
output
5. Simplify QuantityMeasurementApp
● Remove all category-specific
demonstration methods
● Create single generic
demonstration methods
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 4/27
accepting Quantity<?>
● Consolidate comparison,
conversion, and addition
demonstration logic
● Reduce class to orchestration and
testing responsibilities only
● Eliminate method duplication
6. Cross-Category Type Safety
● equals() method
checks this.unit.getClass() !=
that.unit.getClass()
● Prevents invalid comparisons
(e.g., 1 foot ≠  1 kilogram)
● Compiler enforces type
constraints through generics
● Runtime checks provide
additional safety layer
7. Backward Compatibility
● Type aliases or factory methods
can maintain familiar APIs if
needed
● Existing test cases pass without
modification
● Generic implementation is
transparent to callers
8. Scalability Pattern Establishment
● Document process for adding
new categories:
○ Create new enum
implementing IMeasurable
○ Reuse Quantity<U> class
with new enum
○ No new Quantity classes
or demonstration methods
needed
● Pattern proven with length and
weight categories
Postconditions
● A single, type-safe Quantity<U extends
IMeasurable> class replaces multiple
category-specific Quantity classes.
● All unit enums
implement IMeasurable interface,
eliminating structural duplication.
● QuantityMeasurementApp is simplified
with significantly fewer methods and
reduced complexity.
● DRY principle is upheld; logic is
implemented once and reused across all
categories.
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 5/27
● Single Responsibility Principle is
restored; each class has a clear, singular
purpose.
● All functionality from UC1–UC9 is
preserved; behavior is identical.
● Adding new measurement categories
requires only:
○ New enum
implementing IMeasurable interface
○ No changes to Quantity<U>, test
infrastructure, or
QuantityMeasurementApp
● Maintenance burden is significantly
reduced; changes are localized.
● Code complexity scales linearly rather
than exponentially.
● Type safety is enhanced through generics
and bounded type parameters.
HINTS FOR IMPLEMENTING UC10:
Step 1 – Define IMeasurable Interface
● Create a public interface that
standardizes unit behavior:
Step 2 – Refactor LengthUnit to Implement
IMeasurable
● Add implements IMeasurable to enum
declaration
● Implement all interface methods:
○ getConversionFactor() returns
existing conversion factor
○ convertToBaseUnit() multiplies
value by conversion factor
○ convertFromBaseUnit() divides
base value by conversion factor
○ getUnitName() returns descriptive
name (e.g., "FEET", "INCHES")
● Keep all existing constants and
conversion factors unchanged
● No external API modifications; backward
compatible
Step 3 – Refactor WeightUnit to Implement
IMeasurable
● Ensure identical structure to
refactored LengthUnit
● Implement all IMeasurable methods
consistently
● Maintain same conversion factor
definitions
● Consistency prevents confusion and
supports polymorphism
Step 4 –Create Generic QuantityClass
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 6/27
Step 5 – Simplify QuantityMeasurementApp
● Replace category-specific methods with
generic ones:
Step 6 – Update Test Classes
● Rename test classes to reflect generic
nature: QuantityTest instead of
QuantityLengthTest
and QuantityWeightTest
● Use parameterized tests or separate test
classes for each category
● All test logic remains identical; only type
parameters change
Step 7 – Verify Backward Compatibility
● Run all UC1–UC9 test cases unchanged
● Confirm behavior is identical to previous
implementation
● Validate that generic type system
introduces no runtime overhead
Code Snippet
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 7/27
UC10 Code Snippet 1: IMeasurable Interface
UC10 Code Snippet 2: LengthUnit Enum
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 8/27
UC10 Code Snippet 3: WeightUnit Enum
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2od… 9/27
UC10 Code Snippet 4.1 Quantity Class
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 10/27
UC10 Code Snippet 4.2: Quantity Class
UC10 Code Snippet 4.3 Quantity Class
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 11/27
UC10 Code Snippet 5.1
QuantityMeasurementApp Class
UC10 Code Snippet 5.2
QuantityMeasurementApp Class
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 12/27
UC10 Code Snippet 5.3
QuantityMeasurementApp Class Main
Function
Example Output of running the
App
Length Operations (UC1–UC8 functionality
preserved):
● Input: new Quantity<>(1.0,
LengthUnit.FEET).equals(new Quantity<>
(12.0, LengthUnit.INCHES)) →  Output:
true
● Input: new Quantity<>(1.0,
LengthUnit.FEET).convertTo(LengthUnit.INCHES)
→  Output: Quantity(12.0, INCHES)
● Input: new Quantity<>(1.0,
LengthUnit.FEET).add(new Quantity<>
(12.0, LengthUnit.INCHES),
LengthUnit.FEET) →  Output:
Quantity(2.0, FEET)
Weight Operations (UC9 functionality
preserved):
● Input: new Quantity<>(1.0,
WeightUnit.KILOGRAM).equals(new
Quantity<>(1000.0, WeightUnit.GRAM))
→  Output: true
● Input: new Quantity<>(1.0,
WeightUnit.KILOGRAM).convertTo(WeightUnit.GRAM)
→  Output: Quantity(1000.0, GRAM)
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 13/27
● Input: new Quantity<>(1.0,
WeightUnit.KILOGRAM).add(new
Quantity<>(1000.0, WeightUnit.GRAM),
WeightUnit.KILOGRAM) →  Output:
Quantity(2.0, KILOGRAM)
Cross-Category Prevention:
● Input: new Quantity<>(1.0,
LengthUnit.FEET).equals(new Quantity<>
(1.0, WeightUnit.KILOGRAM)) →  Output:
false
● Input:
demonstrateEquality(Quantity<LengthUnit>,
Quantity<WeightUnit>) →  Compiler
error (type mismatch)
Generic Demonstration Methods:
● Input: demonstrateEquality(q1, q2) where
both are Quantity<LengthUnit> →
Output: Unified handling
● Input: demonstrateEquality(w1, w2)
where both are Quantity<WeightUnit> →
Output: Unified handling
Concepts Learned byImplementing UC10:
1. Generic Programming in Java
● Bounded type parameters (<Uextends IMeasurable>) enforcetype constraints at compile-time.
● Generics eliminate codeduplication while maintaining typesafety.● Type erasure is transparent toimplementation; runtime behavioris unchanged.
2. Interface-Based Design
● IMeasurable interface defines acontract for all measurement units.
● Enums implementing interfacesencapsulate behavior withinconstants.
● Enables polymorphic treatment ofdifferent unit types.
3. Single Responsibility Principle (SRP)
● Each class has one reason tochange:○ IMeasurable: defines unitabstraction contract○ Quantity<U>: handlesvalue operations (equals,add, convert)
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 14/27
○ Individual enums: provideunit-specific constants andconversion factors○ QuantityMeasurementApp: orchestrationand demonstration only
4. Don't Repeat Yourself (DRY) Principle
● Logic is implemented oncein Quantity<U> and reused acrossall categories.
● Consistent behavior for length,weight, and all future categories.● Maintenance burden reduced;bug fixes have localized impact.
5. Liskov Substitution Principle (LSP)
● Any IMeasurable implementationcan be used interchangeably withQuantity<U>.● No special handling required fordifferent unit types.● Future unit enums are drop-inreplacements.
6. Open-Closed Principle (OCP)
● The system is open for extension(add new unit enums) but closedfor modification.
● New categories added withouttouching Quantity<U> ordemonstration methods.
● Demonstrates extensibility withoutfragility.
7. Polymorphism and Delegation
● Quantity<U> delegatesconversion responsibility to units.● Polymorphic calls to unit methodsenable transparent categoryhandling.● Reduces complexity in quantityoperations.
8. Type Erasure and Wildcards
● Generic type information iserased at runtime; careful designhandles Quantity<?>
● Wildcards allow flexible methodsignatures while maintainingsafety.● Understanding type erasureprevents common pitfalls.
9. Cross-Category Type Safety
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 15/27
● equals() checks unit.getClass() toensure category matching.● Prevents invalid comparisons (1foot ≠  1 kilogram) at runtime.● Compile-time and runtime checksprovide layered safety.
10.Consolidation of Demonstration Logic
● A single generic method replacesmultiple category-specificmethods.
● Eliminates method duplicationin QuantityMeasurementApp.● Reduces testing complexity bycentralizing demo logic.
11.Scalability and Extensibility
● Adding new measurementcategory requires only:
○ New IMeasurable enumimplementation
○ No changesto Quantity<U> or QuantityMeasurementApp● Codebase growth is linear, notexponential.
12.Enum as Behavior Carrier
● Enums can encapsulate data(conversion factors) and behavior(conversion methods).● More powerful than simpleconstants.
● Thread-safe and immutable bynature.
13.Composition Over Inheritance
● Quantity<U> uses composition(holds a U) rather thaninheritance.● More flexible than category-specific subclasses.● Supports multiple unitimplementations without complexhierarchies.
14.Immutability and FunctionalProgramming
● Quantity<U> objects areimmutable.● Operations return new instancesrather than modifying state.● Thread-safe and supportsfunctional composition.
15.Runtime Type Checking in Generics
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 16/27
● unit.getClass() comparisonenables safe cross-categoryprevention.
● Workaround for type erasurelimitations.● Essential for maintainingmeasurement category integrity.
Key Concepts Tested:
1. IMeasurable Interface Implementation
● LengthUnit correctlyimplements IMeasurable interface.
● WeightUnit correctlyimplements IMeasurable interface.● All required methods are presentand functional.● Enums are accessible throughinterface type.
2. Generic Quantity Class Functionality
● Quantity<LengthUnit> worksidentically to originalQuantityLength.
● Quantity<WeightUnit> worksidentically tooriginal QuantityWeight.● Type erasure does not impactruntime behavior.
3. Type Safety Through Generics
● Compiler preventsQuantity<LengthUnit> from beingassigned toQuantity<WeightUnit> variable.● Type wildcards (Quantity<?>) allow flexible methodparameters.● Bounded type parametersenforce IMeasurableimplementation.
4. Cross-Category ComparisonPrevention
● equals() method rejectscomparisons between differentmeasurement categories.
● unit.getClass() check preventsaccidental cross-category equality.● Runtime type checkingcomplements compile-time safety.
5. Backward Compatibility
● All UC1–UC9 test cases passwithout modification.
● Behavior is identical; onlyimplementation structurechanged.
● External API remains consistent.
6. Simplified QuantityMeasurementApp
● Singlegeneric demonstrateEquality() method
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 17/27
handles all categories.● Significantly fewer total methodscompared to UC9.● Reduced class complexity andresponsibilities.
7. Scalability for New Categories
● Creating a new unit enum(e.g., VolumeUnit) requiresonly IMeasurable implementation.
● No changes to Quantity<U> ordemonstration methods needed.
● Existing test infrastructure workswith new units immediately.
8. Polymorphic Behavior
● Quantity<?> method signaturesaccept any IMeasurable unit type.
● Polymorphism handles category-specific logic transparently.
● Eliminates method overloadingexplosion.
9. Interface Implementation by Enums
● Enums can implement interfaceseffectively.● Interface methods behaveconsistently across enumconstants.● Allows treating different unitenums uniformly.
10.DRY Principle Validation
● No duplication of comparison,conversion, or addition logic.● All categories share identicalalgorithm implementations.● Bug fixes or improvementsapplied once benefit allcategories.
11.SRP Adherence
● Quantity<U> handles valueoperations exclusively.
● Unit enums handle conversionfactors and conversionsexclusively.● QuantityMeasurementApp orchestratesdemonstrations exclusively.
● No class has multiple, conflictingresponsibilities.
12.Type Erasure Handling
● getClass() comparison worksdespite type erasure.
● Runtime type information ispreserved through unitreferences.● Generic information accessiblethrough unit class.
13.Maintainability Improvements
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 18/27
● Reducing redundancy simplifiesmaintenance.
● Consistent patterns make codepredictable and understandable.
● Single source of truth for allquantity operations.
14.Performance
● Generic approach introduces noruntime overhead.
● Type erasure ensures compiledcode efficiency.
● Polymorphism cost is minimal andacceptable.
15.Future-Proofing
● Architecture supports dozens ofmeasurement categories withoutrefactoring.● Adding new categories isstraightforward and repeatable.● Pattern scales linearly withoutexponential complexity.
Test Case Examples:
1. testIMeasurableInterface_LengthUnitImplementation()–
● Verifies that LengthUnit correctlyimplements IMeasurable interface.● Tests: All interface methods arepresent and functional.
2. testIMeasurableInterface_WeightUnitImplementation()–
● Verifies that WeightUnit correctlyimplements IMeasurable interface.
● Tests: All interface methods arepresent and functional.
3. testIMeasurableInterface_ConsistentBehavior()–
● Verifies that both LengthUnit andWeightUnit implement methodsconsistently.● Tests: Method signatures andreturn types match interfacecontract.
4. testGenericQuantity_LengthOperations_Equality()–
● Verifiesthat Quantity<LengthUnit> equalityworks identically to originalQuantityLength.● Tests: new Quantity<>(1.0,FEET).equals(new Quantity<>(12.0, INCHES)) returns true.
5. testGenericQuantity_WeightOperations_Equality()
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 19/27
–
● Verifies that Quantity<WeightUnit> equalityworks identically to originalQuantityWeight.● Tests: new Quantity<>(1.0,KILOGRAM).equals(newQuantity<>(1000.0, GRAM))returns true.
6. testGenericQuantity_LengthOperations_Conversion()–
● Verifiesthat Quantity<LengthUnit> conversionworks correctly.
● Tests: new Quantity<>(1.0,FEET).convertTo(INCHES) returnsQuantity(12.0, INCHES).
7. testGenericQuantity_WeightOperations_Conversion()–
● Verifiesthat Quantity<WeightUnit> conversionworks correctly.● Tests: new Quantity<>(1.0,KILOGRAM).convertTo(GRAM) returnsQuantity(1000.0, GRAM).
8. testGenericQuantity_LengthOperations_Addition()–
● Verifies that Quantity<LengthUnit>addition works correctly.● Tests: new Quantity<>(1.0,FEET).add(new Quantity<>(12.0,INCHES), FEET)returns Quantity(2.0, FEET).
9. testGenericQuantity_WeightOperations_Addition()
● Verifies that Quantity<WeightUnit> additionworks correctly.
● Tests: new Quantity<>(1.0,KILOGRAM).add(new Quantity<>(1000.0, GRAM), KILOGRAM)returns Quantity(2.0, KILOGRAM).
10.testCrossCategoryPrevention_LengthVsWeight()
● Verifies that Quantity<LengthUnit> and Quantity<WeightUnit> cannotbe compared.
● Tests: equals() returns false whencategories differ.
11.testCrossCategoryPrevention_CompilerTypeSafety()
● Verifies that compiler rejects typemismatches at compile-time.
● Tests: Code with type mismatchdoes not compile.
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 20/27
12.testGenericQuantity_ConstructorValidation_NullUnit()
● Verifies that null unit is rejected inconstructor.
● Tests: new Quantity<>(1.0, null)throws IllegalArgumentException.
13.testGenericQuantity_ConstructorValidation_InvalidValue()
● Verifies that non-finite values arerejected.
● Tests: new Quantity<>(Double.NaN, FEET) throwsIllegalArgumentException.
14.testGenericQuantity_Conversion_AllUnitCombinations()
● Verifies conversion between allunit pairs for multiple categories.● Tests: Mathematical correctnessacross conversions.
15.testGenericQuantity_Addition_AllUnitCombinations()
● Verifies addition with same anddifferent units across categories.● Tests: Addition with explicit targetunit specification.
16.testBackwardCompatibility_AllUC1Through9Tests()
● Runs all test cases from UC1–UC9unchanged.
● Tests: All functionality is preservedin refactored design.
17.testQuantityMeasurementApp_SimplifiedDemonstration_Equality()
● Verifies that single genericdemonstration method handlesequality.● Tests: demonstrateEquality() workswith length and weight quantities.
18.testQuantityMeasurementApp_SimplifiedDemonstration_Conversion()
● Verifies that single genericdemonstration method handlesconversion.
● Tests: demonstrateConversion()works with length and weightquantities.
19.testQuantityMeasurementApp_SimplifiedDemonstration_Addition()
● Verifies that single genericdemonstration method handlesaddition.
● Tests: demonstrateAddition()works with length and weightquantities.
20.testTypeWildcard_FlexibleSignatures()
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 21/27
● Verifies that methodsusing Quantity<?> work withmultiple unit types.● Tests: Single method signaturehandles all categories.
21.testScalability_NewUnitEnumIntegration()
● Creates a test VolumeUnit enumand verifies it works withQuantity<VolumeUnit>.
● Tests: New categories integrateseamlessly without refactoringexisting code.
22.testScalability_MultipleNewCategories()
● Tests addition of temperature,time, and other measurementcategories.
● Verifies: No modificationsto Quantity<U> orQuantityMeasurementApp needed.
23.testGenericBoundedTypeParameter_Enforcement()
● Verifies that bounded typeparameter <U extendsIMeasurable> enforces interfaceimplementation.● Tests: Onlyvalid IMeasurable types areaccepted by compiler.
24.testHashCode_GenericQuantity_Consistency()
● Verifies that hashCode() isconsistent across generic types.● Tests: Generic quantities withequal base values have equalhash codes.
25.testEquals_GenericQuantity_ContractPreservation()
● Verifies that equals() contract(reflexive, symmetric, transitive) ismaintained.● Tests: All equality mathematicalproperties hold for genericquantities.
26.testEnumAsUnitCarrier_BehaviorEncapsulation()
● Verifies that enum constants carrybehavior throughIMeasurable interface.● Tests: Polymorphic calls to unitmethods work correctly acrosscategories.
27.testTypeErasure_RuntimeSafety()
● Verifies that type erasure does notcompromise runtime safety.
● Tests: Cross-category checks workdespite generic type erasure.
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 22/27
28.testCompositionOverInheritance_Flexibility()
● Verifies that compositionapproach is more flexible thaninheritance-based design.● Tests: Quantity<U> works with anyIMeasurable implementation.
29.testCodeReduction_DRYValidation()
● Measures reduction in total linesof code and duplicationcompared to UC9.● Tests: Generic design containssignificantly less redundancy.
30.testMaintainability_SingleSourceOfTruth()
● Verifies that comparison andarithmetic logic is implementedonce.
● Tests: Changes toequals() or add() automaticallybenefit all categories.
31.testArchitecturalReadiness_MultipleNewCategories()
● Tests addition of 5+ new unittypes (VolumeUnit,TemperatureUnit, TimeUnit, etc.).● Verifies: No refactoring ofexisting code required.
32.testPerformance_GenericOverhead()
● Benchmarks generic versionagainst UC9 implementation.
● Tests: Generic approachintroduces negligibleperformance overhead.
33.testDocumentation_PatternClarity()
● Verifies that documentation clearlyexplains how to add new unitenums.
● Tests: New developers can easilyextend system with new categoriesfollowing documentation.
34.testInterfaceSegregation_MinimalContract()
● Verifies that IMeasurable interfaceis minimal and focused.● Tests: Enums are not burdenedwith unnecessary methods.
35.testImmutability_GenericQuantity()
● Verifies that Quantity<U> objectsare immutable.
● Tests: No setters exist; alloperations return new instances.
Code Snippet for Test Cases
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 23/27
UC10 Quantity Measurement App Test Cases6.1
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 24/27
UC10 Quantity Measurement App Test Cases6.2
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 25/27
UC10 Quantity Measurement App Test Cases6.3
UC10 UC10 Test Case Results
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 26/27
Published using Google Docs Report abuse Learn more
UC10: Generic Quantity Class with Unit Interface for Multi-Category Sup…Updated automatically every 5minutes
19/06/2026, 08:43 UC10: Generic Quantity Class with Unit Interface for Multi-Category Support
https://docs.google.com/document/d/e/2PACX-1vSi1yw84S4sfGDl-N32sfibDAirvVUD32vvhblTp5n_wA_vintK3E7qq_vCMURhc8s6DWJYWY2o… 27/27


---
# UC11_ Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)(1)

UC11: VolumeMeasurement Equality,Conversion, and Addition(Litre, Millilitre, Gallon)
Description
UC11 extends the Quantity MeasurementApplication to support volume measurementsalongside length and weight measurements.This use case introduces a new measurementcategory—volume—that operates independentlyfrom length and weight through the genericQuantity<U> class and IMeasurable interfaceestablished in UC10.
Similar to length and weight measurements,volume measurements in different units (litres,millilitres, gallons) will support equalitycomparison, unit conversion, and arithmeticaddition operations. The application will supportthree volume units:
● Litre (L): Base unit for volumeconversions
● Millilitre (mL): 1 L = 1000 mL● Gallon (gal): 1 gallon ≈  3.78541 L
UC11 validates that the generic design patternsestablished in UC10 scale seamlessly to a thirdmeasurement category without requiring anymodifications to the Quantity<U> class,QuantityMeasurementApp, or existing testinfrastructure. This use case demonstrates thetrue power of the refactored architecture andconfirms that adding new measurementcategories is straightforward and repeatable.
Preconditions
● The
refactored Quantity<U extends IMeasurable>
class from UC10 is fully operational.
● The IMeasurable interface is defined with
methods for unit conversions.
● Both LengthUnit and WeightUnit enums
implement IMeasurable and are fully
functional.
● All functionality from UC1–UC10 is
preserved and unaffected by UC11
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 1/21
additions.
● A new VolumeUnit enum will be created
implementing IMeasurable with LITRE as
the base unit.
● Conversion factors for all volume units
are defined relative to litres (base unit).
● Volume measurements are treated as a
separate, non-interoperable category
from length and weight.
● No modifications to
existing Quantity<U>, IMeasurable, or
QuantityMeasurementApp are required.
Main Flow
1. Create VolumeUnit Enum
Implementing IMeasurable
● Define an enum with volume units
(LITRE, MILLILITRE, GALLON).
● Assign conversion factors relative
to the base unit (litre):
○ LITRE: 1.0 (base unit)
○ MILLILITRE: 0.001 (1 mL =
0.001 L)
○ GALLON: 3.78541 (1
gallon ≈  3.78541 L)
● Implement all IMeasurable
interface methods:
○ getConversionFactor() -
returns the conversion
factor
○ convertToBaseUnit(double
value) - converts value to
litres
○
convertFromBaseUnit(double
baseValue) - converts from
litres to this unit
○ getUnitName() - returns
readable unit name
2. Equality Comparison
● User inputs two numerical values
with their respective volume unit
types.
● Quantity<VolumeUnit> class
(inherited from
generic Quantity<U>) validates
input values.
● Both values are converted to the
common base unit (litre)
using VolumeUnit conversion
methods.
● The converted values are
compared for equality using the
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 2/21
generic equals() method.
● The result of the comparison (true
or false) is returned.
3. Unit Conversion
● User inputs a numerical value,
source unit, and target unit (all
volume units).
●
Quantity<VolumeUnit>.convertTo(targetUnit)
converts the measurement to the
target unit.
● The method normalizes through
the base unit (litre) and applies
appropriate conversion factors.
● A
new Quantity<VolumeUnit> object
is returned with the converted
value and target unit.
4. Addition Operations
● User inputs
two Quantity<VolumeUnit>
objects and optionally a target
unit.
● Both measurements are converted
to the base unit (litre) using the
generic add() method.
● The converted values are
summed.
● The result is converted to the
target unit (either first operand's
unit or explicitly specified unit).
● A new Quantity<VolumeUnit>
object representing the sum is
returned.
5. Cross-Category Type Safety
● Attempting to compare volume
with length or weight returns false
(different categories).
● Compiler prevents mixing
Quantity<VolumeUnit>
with Quantity<LengthUnit>
or Quantity<WeightUnit>.
● Runtime type checking
in equals() method ensures
category isolation.
6. Integration with Existing System
● VolumeUnit enum is used
seamlessly with the existing
generic Quantity<U> class.
● No modifications to
QuantityMeasurementApp
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 3/21
needed; existing generic methods
handle volume quantities.
● All existing demonstration and test
methods work with volume units
automatically.
Postconditions
● Volume measurements of the same unit
and value are considered equal.
● Volume measurements of different units
but equivalent values are considered
equal (e.g., 1 L = 1000 mL = ~0.264172
gallons).
● Unit conversions between volume units
produce mathematically accurate results
within floating-point precision.
● Addition of two volume measurements
produces a
new Quantity<VolumeUnit> object
without modifying originals
(immutability).
● All previous functionality from UC1–
UC10 for length and weight
measurements is preserved and works
correctly.
● Volume, length, and weight
measurements are treated as separate,
non-interoperable categories.
● No modifications
to Quantity<U>, IMeasurable,
QuantityMeasurementApp, or existing
test infrastructure are required.
● The architectural pattern is validated as
truly scalable; new categories integrate
effortlessly.
● Adding additional measurement
categories (temperature, time, etc.)
follows the identical pattern.
HINTS FOR IMPLEMENTING UC10:
As you develop this use case, you will notice
that only the VolumeUnit enum needs to be
created to support volume measurements. The
existing Quantity class and IMeasurable interface
are already designed to handle multiple
measurement types. Also no changes to the
QuantityMeasurementApp class are necessary as
it is already structured to demonstrate all
operations generically. We will simply add new
code in the main method of Quantity and
QuantityMeasurementApp to demonstrate
volume unit operations. Also the existing test
cases for weight and length will continue to
work without any modifications, once we add
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 4/21
the new test cases for volume units in the
QuantityMeasurementAppTest class.
Operations tested in the main method of
Quantity Class and QuantityMeasurementApp
class are:
1. Comparison: Compare volumes of
different units (e.g., 1 L == 1000 mL)
2. Conversion: Convert volume from one
unit to another using conversion factors
3. Addition: Add two volume quantities and
express result in a specified unit
Step 1 – Create VolumeUnit Enum
● Define VolumeUnit as a standalone enum
implementing IMeasurable:
Step 2 – Verify Conversion Factor Accuracy
● LITRE: 1.0 (already base unit)
● MILLILITRE: 0.001 (1 mL = 0.001 L, or 1
L = 1000 mL)
● GALLON: 3.78541 (1 US gallon ≈
3.78541 L, or 1 L ≈  0.264172 gallons)
Test conversion formulas:
● convertToBaseUnit(1.0, MILLILITRE)  →
0.001
● convertToBaseUnit(1.0, GALLON) →
3.78541
● convertFromBaseUnit(1.0, GALLON)  →
~0.264172
Step 3 – Create Quantity Instances
● Use the generic Quantity<U> class with
VolumeUnit:
○ Quantity<VolumeUnit> volume1 =
new Quantity<>(1.0,
VolumeUnit.LITRE);
○ Quantity<VolumeUnit> volume2 =
new Quantity<>(1000.0,
VolumeUnit.MILLILITRE);
○ Quantity<VolumeUnit> volume3
= new Quantity<>(1.0,
VolumeUnit.GALLON);
Step 4 – Test Equality Comparisons
● Verify that the generic equals() method
works correctly for volume units:
○ volume1.equals(volume2);  // true
(1 L == 1000 mL)
○ volume1.equals(volume3);  // true
(1 L == ~0.264172 gallons) -
within epsilon
○ volume3.equals(volume1);  // true
(symmetric)
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 5/21
Step 5 – Test Unit Conversions
● Verify that the generic convertTo()
method works correctly:
○
volume1.convertTo(VolumeUnit.MILLILITRE);
 // Quantity(1000.0, MILLILITRE)
○
volume3.convertTo(VolumeUnit.LITRE);
      // Quantity(3.78541, LITRE)
○
volume2.convertTo(VolumeUnit.GALLON);
     // Quantity(~0.000264172,
GALLON)
Step 6 – Update Test Classes
● Verify that the generic add() methods
work correctly:
● // Implicit target unit (first operand's
unit)
○ volume1.add(volume2);              
                             //
Quantity(2.0, LITRE)
● // Explicit target unit
○ volume1.add(volume3,
VolumeUnit.MILLILITRE);          //
Quantity(4785.41, MILLILITRE)
○ volume2.add(volume3,
VolumeUnit.GALLON);           //
Quantity(~1.26417, GALLON)
Step 7 –Test Cross-Category Prevention
● Verify that volume cannot be compared
with length or weight:
○ volume1.equals(new Quantity<>
(1.0, LengthUnit.LITRE));  // false
○ volume1.equals(new Quantity<>
(1.0, WeightUnit.LITRE));  // false
(if such units existed)
Step 8 – Comprehensive Test Coverage
● Ensure test cases cover:
○ Litre-to-litre, millilitre-to-millilitre,
gallon-to-gallon equality
○ Cross-unit volume equality (L ↔
mL, L ↔  gallon, mL ↔  gallon)
○ Conversion between all unit pairs
○ Addition with same and different
units
○ Addition with explicit target unit
specification
○ Volume vs. length and weight
incompatibility
○ Null handling, invalid inputs,
edge cases (zero, negative, large
values)
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 6/21
○ Precision and rounding across
conversions
Step 9 – Integration Testing
● Verify that existing generic demonstration
methods
in QuantityMeasurementApp work with
volume quantities without modification:
● // These methods work automatically
with VolumeUnit
○ demonstrateEquality(volume1,
volume2);
○ demonstrateConversion(volume1,
VolumeUnit.MILLILITRE);
○ demonstrateAddition(volume1,
volume2, VolumeUnit.LITRE);
Step 10 – Backward Compatibility Validation
● Run all test cases from UC1–UC10 to
ensure volume additions do not affect
length or weight functionality.
Example Output of running the
App
Equality Comparisons:
● Input: new Quantity<>(1.0,
LITRE).equals(new Quantity<>(1.0,
LITRE)) →
Output: true
● Input: new Quantity<>(1.0,
LITRE).equals(new Quantity<>(1000.0,
MILLILITRE)) →  Output: true
● Input: new Quantity<>(1.0,
GALLON).equals(new Quantity<>(1.0,
GALLON)) →  Output: true
● Input: new Quantity<>(1.0,
LITRE).equals(new Quantity<>
(~0.264172, GALLON)) →  Output: true
(within epsilon)
● Input: new Quantity<>(500.0,
MILLILITRE).equals(new Quantity<>(0.5,
LITRE)) →  Output: true
● Input: new Quantity<>(3.78541,
LITRE).equals(new Quantity<>(1.0,
GALLON)) →  Output: true (within
epsilon)
Unit Conversions:
● Input: new Quantity<>(1.0,
LITRE).convertTo(MILLILITRE) →  Output:
Quantity(1000.0, MILLILITRE)
● Input: new Quantity<>(2.0,
GALLON).convertTo(LITRE) →  Output:
Quantity(~7.57082, LITRE)
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 7/21
● Input: new Quantity<>(500.0,
MILLILITRE).convertTo(GALLON) →
Output: Quantity(~0.132086, GALLON)
● Input: new Quantity<>(0.0,
LITRE).convertTo(MILLILITRE) →  Output:
Quantity(0.0, MILLILITRE)
● Input: new Quantity<>(1.0,
LITRE).convertTo(LITRE) →  Output:
Quantity(1.0, LITRE)
Addition Operations (Implicit Target Unit):
● Input: new Quantity<>(1.0,
LITRE).add(new Quantity<>(2.0, LITRE))
→  Output: Quantity(3.0, LITRE)
● Input: new Quantity<>(1.0,
LITRE).add(new Quantity<>(1000.0,
MILLILITRE)) →  Output: Quantity(2.0,
LITRE)
● Input: new Quantity<>(500.0,
MILLILITRE).add(new Quantity<>(0.5,
LITRE)) →  Output: Quantity(1000.0,
MILLILITRE)
● Input: new Quantity<>(2.0,
GALLON).add(new Quantity<>(3.78541,
LITRE)) →  Output: Quantity(3.0,
GALLON)
Addition Operations (Explicit Target Unit):
● Input: new Quantity<>(1.0,
LITRE).add(new Quantity<>(1000.0,
MILLILITRE), MILLILITRE) →  Output:
Quantity(2000.0, MILLILITRE)
● Input: new Quantity<>(1.0,
GALLON).add(new Quantity<>(3.78541,
LITRE), GALLON) →  Output:
Quantity(~2.0, GALLON)
● Input: new Quantity<>(500.0,
MILLILITRE).add(new Quantity<>(1.0,
LITRE), GALLON) →  Output:
Quantity(~0.396258, GALLON)
● Input: new Quantity<>(2.0,
LITRE).add(new Quantity<>(4.0,
GALLON), LITRE) →  Output:
Quantity(~17.14164, LITRE)
Category Incompatibility:
● Input: new Quantity<>(1.0,
LITRE).equals(new Quantity<>(1.0,
FOOT)) →  Output: false (different
categories)
● Input: new Quantity<>(1.0,
LITRE).equals(new Quantity<>(1.0,
KILOGRAM)) →  Output: false (different
categories)
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 8/21
Concepts Learned byImplementing UC10:
1. Scalability of Generic Design
● Adding a third measurementcategory (volume) requires only anew enumimplementing IMeasurable.● No changes to Quantity<U>,demonstration methods, or testinfrastructure.● Validates that the UC10refactoring achieves truescalability.
2. Pattern Replication Across Categories
● VolumeUnit mirrors the structureof LengthUnit and WeightUnit.● Identical enum patterns(constants, conversion factors,interface methods) reducecognitive load.
● New developers can quicklyunderstand and extend thesystem.
3. Base Unit Selection
● Each measurement category has achosen base unit (length: feet,weight: kilogram, volume: litre).
● Base unit selection impactsconversion factor precision andformula simplicity.● Consistency in base unit approachacross categories simplifiesreasoning.
4. Conversion Factor Precision
● Volume conversions requireaccuracy to multiple decimalplaces (e.g., 3.78541 for gallons).● Precision impacts equality acrossunits; epsilon-based tolerancehandles floating-point rounding.● Different categories may havevastly different conversion factormagnitudes.
5. IMeasurable Interface Power
● Single interface enablespolymorphic treatment of allmeasurement units.● Enums implementing interfacesencapsulate data and behavioreffectively.
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKSTH… 9/21
● Demonstrates that interfaces arenot limited to class-basedhierarchies.
6. Generic Type Constraints
● Bounded type parameter <Uextends IMeasurable> ensuresonly valid units are used.● The compiler enforces constraintsat compile-time; runtime checksprovide a safety layer.● Type constraints enable safepolymorphism across diverse unittypes.
7. Category Type Safety ThroughGenerics
● Generic type parameter preventsaccidental mixing of measurementcategories.
● Compilerrejects Quantity<VolumeUnit> assignmentto Quantity<LengthUnit> variable.
● Runtime unit.getClass() checkadds an additional protectionlayer.
8. Immutability Across All Categories
● Quantity<VolumeUnit> objectsare immutable, consistent withother categories.
● Addition, conversion return newinstances; originals remainunchanged.● Thread-safe operations acrossconcurrent callers.
9. Method Overloading Consistency
● Generic add() methods (implicitand explicit target unit) workidentically for volume.
● Consistent API across length,weight, and volume reducessurprise.
● Flexibility in target unitspecification enhances usability.
10.DRY Principle Validation at Scale
● Adding volume proves that DRYprinciple is maintained acrossthree categories.
● Comparison, conversion, additionlogic is implemented once andreused.
● Potential for adding 10+categories without duplicatingcore logic.
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 10/21
11.Separation of Concerns
● VolumeUnit enum handlesconversion factors and unit-specific logic exclusively.
● Quantity<U> handles valueoperations exclusively.
● QuantityMeasurementApp handlesdemonstration exclusively.● Clear responsibility boundariesimprove maintainability.
12.Polymorphic Unit Behavior
● All units (LengthUnit, WeightUnit,VolumeUnit) can be treateduniformlythrough IMeasurable interface.● Polymorphic method calls enablea single code path for allcategories.
● New units integrate transparentlywithout code branching.
13.Floating-Point Precision AcrossCategories
● Volume conversions involvedifferent precision requirementsthan length or weight.
● Standardized epsilon-basedcomparison ensures consistentbehavior.
● Rounding to two decimal placesmaintains predictability.
14.Enum as Polymorphic Carrier
● Enums are not just constants; theycan encapsulate complexbehavior.● Multiple enum implementationsof IMeasurable interface allowpolymorphic usage.
● The thread-safe and immutablenature of enums suits this patternperfectly.
15.Architectural Readiness Validation
● UC11 proves that UC10architecture scales linearly withnew categories.
● No exponential complexity asseen in UC9 without refactoring.● The system is ready for dozens ofmeasurement categories.
Key Concepts Tested:
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 11/21
1. Litre-to-Litre Equality
● Two measurements in litres withthe same value are equal.
● Verifies baseline equality forvolume measurements.
2. Millilitre-to-Millilitre Equality
● Two measurements in millilitreswith the same value are equal.
● Tests within-unit equality formillilitre measurements.
3. Gallon-to-Gallon Equality
● Two measurements in gallons withthe same value are equal.
● Tests within-unit equality for gallonmeasurements.
4. Cross-Unit Volume Equality (Litre toMillilitre)
● 1 litre equals 1000 millilitres.
● Tests conversion accuracybetween metric units.
5. Cross-Unit Volume Equality (Litre toGallon)
● 1 litre approximately equals0.264172 gallons (or 1 gallon ≈3.78541 litres).● Tests conversion accuracybetween metric and imperialunits.
6. Cross-Unit Volume Equality (Millilitreto Gallon)
● 1000 millilitres approximatelyequals 0.264172 gallons.● Tests multi-step conversionthrough the base unit.
7. Volume vs. Length Incompatibility
● Comparing a volumemeasurement with a lengthmeasurement returns false.
● Verifies category type safety.
8. Volume vs. Weight Incompatibility
● Comparing a volumemeasurement with a weightmeasurement returns false.● Verifies category type safetyacross multiple incompatibilities.
9. Unit Conversion Accuracy
● Conversions between all volumeunit pairs produce mathematicallycorrect results.
● Round-trip conversions preservevalues within epsilon tolerance.
10.Symmetric Equality
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 12/21
● If A equals B, then B equals A(commutative property).
● Tests bidirectional conversionaccuracy.
11.Transitive Equality
● If A equals B and B equals C, thenA equals C.
● Tests that conversion logicmaintains mathematicalproperties.
12.Addition with Same Units
● Two volumes in the same unit sumcorrectly.● Result is in the unit of the firstoperand (default behavior).
13.Addition with Different Units
● Two volumes in different units areconverted and summed correctly.● Result is in the unit of the firstoperand (default behavior).
14.Addition with Explicit Target Unit
● Sum can be expressed in anysupported volume unit.● Explicit target unit overridesdefault behavior.
15.Addition Commutativity
● add(A, B, targetUnit) equalsadd(B, A, targetUnit).● Tests that order does not affect thesum.
16.Null Handling
● Comparing with null returns falseor throws exception.● Null units are rejected withvalidation error.
17.Same Reference Equality
● A volume object equals itself(reflexive property).
● Tests object identity comparison.
18.Precision and Rounding
● Cross-unit conversions maintainaccuracy within floating-pointepsilon tolerance.
● Consistent rounding behavioracross all conversions.
19.Different Volume Values
● 1 litre does not equal 2 litres.● Tests inequality detection.
20.Invalid Unit Handling
● Unsupported units are rejectedwith appropriate exceptions.
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 13/21
● Tests unit validation logic.
21.Type Safety in Collections
● Volume objects can be stored insets and maps with consistenthashing.● Tests hashCode() consistency withequals().
22.Edge Cases (Zero, Negative, LargeValues)
● Conversions and additions workcorrectly with zero, negative, andlarge magnitude values.
● Floating-point precision ismaintained across all ranges.
23.VolumeUnit Enum Methods
● convertToBaseUnit() andconvertFromBaseUnit() methodsfunction correctly.● Enum constants are immutableand thread-safe.
24.Generic Quantity Works withVolumeUnit
● All generic Quantity<U> methodswork seamlessly with VolumeUnit.● No specialized code needed forthe volume category.
25.Pattern Consistency
● VolumeUnit structure mirrorsLengthUnit and WeightUnit.● New categories integrate withidentical patterns.
Test Case Examples:
1. testEquality_LitreToLitre_SameValue()–
● Verifies that new Quantity<>(1.0,LITRE).equals(new Quantity<>(1.0, LITRE)) returns true.● Tests: equals() returns true foridentical litre measurements.
2. testEquality_LitreToLitre_DifferentValue()–
● Verifiesthat new Quantity<>(1.0,LITRE).equals(new Quantity<>(2.0, LITRE)) returns false.● Tests: equals() returns false fordifferent litre measurements.
3. testEquality_LitreToMillilitre_EquivalentValue()–
● Verifies that new Quantity<>(1.0,LITRE).equals(new Quantity<>(1000.0, MILLILITRE)) returns true.
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 14/21
● Tests: equals() returns true forlitre-to-millilitre conversion..
4. testEquality_MillilitreToLitre_EquivalentValue()–
● Verifies that new Quantity<>(1000.0, MILLILITRE).equals(newQuantity<>(1.0, LITRE)) returnstrue.● Tests: equals() returns true (testssymmetry of conversion).
5. testEquality_LitreToGallon_EquivalentValue()–
● Verifies that new Quantity<>(1.0,LITRE).equals(new Quantity<>(~0.264172, GALLON)) returnstrue (within epsilon).
● Tests: equals() returns true forlitre-to-gallon conversion.6. testEquality_GallonToLitre_EquivalentValue()– ● Verifies that new Quantity<>(1.0,GALLON).equals(new Quantity<>(~3.78541, LITRE)) returns true(within epsilon).
● Tests: equals() returns true (testssymmetry of conversion).
7. testEquality_VolumeVsLength_Incompatible()–
● Verifies that new Quantity<>(1.0,LITRE).equals(new Quantity<>(1.0, FOOT)) returns false.
● Tests: equals() returns false whencomparing incompatiblemeasurement categories.
8. testEquality_VolumeVsWeight_Incompatible()– ● Verifies that new Quantity<>(1.0,LITRE).equals(new Quantity<>(1.0, KILOGRAM)) returns false.● Tests: equals() returns false whencomparing volume with weight.
9. testEquality_NullComparison() –● Verifies that new Quantity<>(1.0,LITRE).equals(null) returns false.● Tests: equals() returns false whencomparing with null.
10.testEquality_SameReference() –● Verifies that a volume objectequals itself (reflexive property).
● Tests: equals() returns true whencomparing an object with itself.
11.testEquality_NullUnit() –
● Verifies that new Quantity<>(1.0,null) throwsIllegalArgumentException.
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 15/21
● Tests: Exception thrown for nullunit in constructor.
12.testEquality_TransitiveProperty() –
● Verifies transitive property: if Aequals B and B equals C, then Aequals C.● Example: 1.0 L = 1000.0 mL and1000.0 mL = 1.0 L, therefore 1.0L = 1.0 L.
13.testEquality_ZeroValue() –● Verifies that new Quantity<>(0.0,LITRE).equals(new Quantity<>(0.0, MILLILITRE)) returns true.● Tests: Zero values are consideredequal across units.
14.testEquality_NegativeVolume() –● Verifies that new Quantity<>(-1.0,LITRE).equals(new Quantity<>(-1000.0, MILLILITRE)) returnstrue.
● Tests: Negative volume values arehandled correctly in conversions
15.testEquality_LargeVolumeValue() –
● Verifies that new Quantity<>(1000000.0,MILLILITRE).equals(newQuantity<>(1000.0, LITRE))returns true.
● Tests: Large magnitude valuesmaintain precision acrossconversions.
16.testEquality_SmallVolumeValue() –
● Verifies that new Quantity<>(0.001, LITRE).equals(newQuantity<>(1.0, MILLILITRE))returns true.● Tests: Small magnitude valuesmaintain precision acrossconversions.
17.testConversion_LitreToMillilitre() –
● Verifies that new Quantity<>(1.0,LITRE).convertTo(MILLILITRE)returns Quantity(1000.0,MILLILITRE).● Tests: Conversion from litre tomillilitre.
18.testConversion_MillilitreToLitre() –● Verifies that new Quantity<>(1000.0,MILLILITRE).convertTo(LITRE)returns Quantity(1.0, LITRE).
● Tests: Conversion from millilitre tolitre.
19.testConversion_GallonToLitre() –
● Verifies that new Quantity<>(1.0,GALLON).convertTo(LITRE) returnsQuantity(~3.78541, LITRE) (withinepsilon).
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 16/21
● Tests: Conversion from gallon tolitre.
20.testConversion_LitreToGallon() –
● Verifies that new Quantity<>(3.78541,LITRE).convertTo(GALLON) returnsQuantity(~1.0, GALLON) (withinepsilon).
● Tests: Conversion from litre togallon.
21.testConversion_MillilitreToGallon() –
● Verifies that new Quantity<>(1000.0,MILLILITRE).convertTo(GALLON)returns Quantity(~0.264172,GALLON) (within epsilon).
● Tests: Conversion from millilitre togallon.
22.testConversion_SameUnit() –● Verifies that new Quantity<>(5.0,LITRE).convertTo(LITRE) returnsQuantity(5.0, LITRE).
● Tests: Converting to the same unitreturns unchanged value.
23.testConversion_ZeroValue() –● Verifies that new Quantity<>(0.0,LITRE).convertTo(MILLILITRE)returns Quantity(0.0, MILLILITRE).
● Tests: Zero value conversionacross units.
24.testConversion_NegativeValue() –● Verifies that new Quantity<>(-1.0,LITRE).convertTo(MILLILITRE)returns Quantity(-1000.0,MILLILITRE).● Tests: Negative volume conversionpreserves sign.
25.testConversion_RoundTrip() –
● Verifies that new Quantity<>(1.5,LITRE).convertTo(MILLILITRE).convertTo(LITRE)returns Quantity(~1.5, LITRE)(within epsilon).● Tests: Round-trip conversionspreserve value within floating-point tolerance.
26.testAddition_SameUnit_LitrePlusLitre()– ● Verifies that new Quantity<>(1.0,LITRE).add(new Quantity<>(2.0,LITRE)) returns Quantity(3.0,LITRE).
● Tests: Same-unit addition withoutconversion.
27.testAddition_SameUnit_MillilitrePlusMillilitre()–
● Verifies that new Quantity<>(500.0, MILLILITRE).add(newQuantity<>(500.0, MILLILITRE))returns Quantity(1000.0,MILLILITRE).
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 17/21
● Tests: Same-unit addition formillilitres.
28.testAddition_CrossUnit_LitrePlusMillilitre()– ● Verifies that new Quantity<>(1.0,LITRE).add(new Quantity<>(1000.0, MILLILITRE)) returnsQuantity(2.0, LITRE).
● Tests: Cross-unit addition withresult in litre.
29.testAddition_CrossUnit_MillilitrePlusLitre()–
● Verifies that new Quantity<>(1000.0, MILLILITRE).add(newQuantity<>(1.0, LITRE)) returnsQuantity(2000.0, MILLILITRE).● Tests: Cross-unit addition withresult in millilitre.
30.testAddition_CrossUnit_GallonPlusLitre()– ● Verifies that new Quantity<>(1.0,GALLON).add(new Quantity<>(3.78541, LITRE)) returnsQuantity(~2.0, GALLON) (withinepsilon).● Tests: Cross-unit addition withgallons conversion.
31.testAddition_ExplicitTargetUnit_Litre()–
● Verifies that new Quantity<>(1.0,LITRE).add(new Quantity<>(1000.0, MILLILITRE), LITRE)returns Quantity(2.0, LITRE).● Tests: Explicit target unitspecification in litre.
32.testAddition_ExplicitTargetUnit_Millilitre()– ● Verifies that new Quantity<>(1.0,LITRE).add(new Quantity<>(1000.0, MILLILITRE), MILLILITRE)returns Quantity(2000.0,MILLILITRE).● Tests: Explicit target unitspecification in millilitre.
33.testAddition_ExplicitTargetUnit_Gallon()– ● Verifies that new Quantity<>(3.78541, LITRE).add(newQuantity<>(3.78541, LITRE),GALLON) returns Quantity(~2.0,GALLON) (within epsilon).● Tests: Explicit target unitspecification in gallon.
34.testAddition_Commutativity() –● Verifies that new Quantity<>(1.0,LITRE).add(new Quantity<>(1000.0, MILLILITRE)) equals newQuantity<>(1000.0,
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 18/21
MILLILITRE).add(new Quantity<>(1.0, LITRE)) in their respectiveunits.● Tests: Addition is commutativewith appropriate unit conversions.
35.testAddition_WithZero() –● Verifies that new Quantity<>(5.0,LITRE).add(new Quantity<>(0.0,MILLILITRE)) returns Quantity(5.0,LITRE).
● Tests: Adding zero acts as identityelement.
36.testAddition_NegativeValues() –● Verifies that new Quantity<>(5.0,LITRE).add(new Quantity<>(-2000.0, MILLILITRE)) returnsQuantity(3.0, LITRE).● Tests: Addition with negativemeasurements.
37.testAddition_LargeValues() –
● Verifies that new Quantity<>(1e6,LITRE).add(new Quantity<>(1e6,LITRE)) returns Quantity(2e6,LITRE).● Tests: Addition with largemagnitude values.
38.testAddition_SmallValues() –● Verifies that new Quantity<>(0.001, LITRE).add(newQuantity<>(0.002, LITRE)) returnsQuantity(~0.003, LITRE) (withinepsilon).● Tests: Addition with smallmagnitude values.
39.testVolumeUnitEnum_LitreConstant() –● Verifies that VolumeUnit.LITRE isaccessible and has correctconversion factor 1.0.● Tests:VolumeUnit.LITRE.getConversionFactor()returns 1.0.
40.testVolumeUnitEnum_MillilitreConstant()–
● Verifies thatVolumeUnit.MILLILITRE isaccessible and has correctconversion factor 0.001.● Tests:VolumeUnit.MILLILITRE.getConversionFactor()returns 0.001.
41.testVolumeUnitEnum_GallonConstant()–
● Verifies that VolumeUnit.GALLONis accessible and has correctconversion factor 3.78541.● Tests:VolumeUnit.GALLON.getConversionFactor()returns 3.78541.
42.testConvertToBaseUnit_LitreToLitre() –● Verifies thatVolumeUnit.LITRE.convertToBaseUnit(5.0)
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 19/21
returns 5.0.● Tests: Conversion to base unitwhen already in base unit.
43.testConvertToBaseUnit_MillilitreToLitre()– ● Verifies thatVolumeUnit.MILLILITRE.convertToBaseUnit(1000.0)returns 1.0.
● Tests: Conversion from millilitre tolitre (base unit).
44.testConvertToBaseUnit_GallonToLitre()–
● Verifies thatVolumeUnit.GALLON.convertToBaseUnit(1.0)returns 3.78541.● Tests: Conversion from gallon tolitre (base unit).
45.testConvertFromBaseUnit_LitreToLitre()– ● Verifies thatVolumeUnit.LITRE.convertFromBaseUnit(2.0)returns 2.0.● Tests: Conversion from base unit(litre) to litre.
46.testConvertFromBaseUnit_LitreToMillilitre()–
● Verifies thatVolumeUnit.MILLILITRE.convertFromBaseUnit(1.0)returns 1000.0.
● Tests: Conversion from base unit(litre) to millilitre.
47.testConvertFromBaseUnit_LitreToGallon()–
● Verifies thatVolumeUnit.GALLON.convertFromBaseUnit(3.78541)returns ~1.0.● Tests: Conversion from base unit(litre) to gallon, within epsilon.
48.testBackwardCompatibility_AllUC1Through10Tests()– ● Runs all test cases from UC1–UC10 unchanged.
● Tests: All length and weightfunctionality is preserved withvolume additions.
49.testGenericQuantity_VolumeOperations_Consistency()– ● Verifies that generic Quantity<U>works identically for volume as forlength and weight.● Tests: No special handlingneeded for volume category.
50.testScalability_VolumeIntegration() –● Confirms that volume integratesseamlessly with existing system.● Tests: Architecture truly scaleslinearly with new measurement
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 20/21
categories.
Code Snippet for Test Cases
UC 11 Test Case Results
Published using Google Docs Report abuse Learn more
UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Mill…Updated automatically every 5minutes
19/06/2026, 08:43 UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
https://docs.google.com/document/d/e/2PACX-1vTiZO83PBpBTdPH1fHqh9hKfXm10Ogk-g9_2RCpt-JBYzrm7wYnixdm3ZfAD6hOHStZBloKST… 21/21


---
# UC12_ Subtraction and Division Operations on Quantity Measurements(1)

UC12: Subtraction andDivision Operations onQuantity Measurements
Description
UC12 extends the Quantity MeasurementApplication by introducing two new arithmeticoperations—subtraction and division—to thegeneric Quantity<U> class. Building on thefoundation of equality comparison, unitconversion, and addition from UC1–UC11, thisuse case enables more comprehensivearithmetic manipulation of measurements.
Subtraction allows users to find the differencebetween two quantities of the samemeasurement category (e.g., 5 liters - 2 liters =3 liters, or 10 feet - 6 inches = 9.5 feet whenexpressed in feet). Division enables users tocompute the ratio between two quantities,producing a dimensionless scalar result (e.g.,10 kilograms ÷ 5 kilograms = 2.0, representinghow many times one measurement is larger thananother).
Both operations follow the same design patternsestablished in UC1–UC11:
● Support cross-unit arithmetic (differentunits within the same category)● Return results in explicitly specified orimplicitly determined target units● Maintain immutability of original objects● Provide comprehensive error handlingand validation● Adhere to SOLID principles and designconsistency
UC12 demonstrates that the extensibleQuantity<U> design accommodates diverseoperations without fundamental restructuring,reinforcing the scalability and flexibility of thearchitecture.
Preconditions
● The generic Quantity<U extends
IMeasurable> class from UC10 is fully
operational.
● The IMeasurable interface defines unit
conversion contracts.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 1/22
● LengthUnit, WeightUnit, and VolumeUnit
enums implement IMeasurable.
● All functionality from UC1–UC11
(equality, conversion, addition) is
preserved and unaffected.
● New subtraction and division methods
will be added to the Quantity<U> class.
● Corresponding demonstration methods
will be added to
QuantityMeasurementApp.
● Subtraction operations return
Quantity<U> objects (same type as
operands).
● Division operations return Quantity<U>
objects (same type as operands).
● All operations support explicit target unit
specification for result expression.
● Cross-category arithmetic (e.g.,
subtracting weight from length) is
prevented through type safety.
Main Flow
Subtraction Operations
1. User Initiates Subtraction
● Client calls
Quantity<U>.subtract(Quantity<U>
other) or
Quantity<U>.subtract(Quantity<U> other, U
targetUnit).
● Method accepts another quantity
and optionally a target unit.
2. Input Validation
● Verify that the other is non-null
and has a valid unit.
● Verify that both quantities belong
to the same measurement
category (type check
via unit.getClass()).
● Verify that all numeric values are
finite (not NaN or infinite).
3. Conversion to Base Unit
● Convert both this and other to the
common base unit using
IMeasurable.convertToBaseUnit().
● Subtract the converted values:
baseResult =this.baseValue -
other.baseValue.
4. Convert Result to Target Unit
● If no target unit is specified, use
the unit of the first operand
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 2/22
(implicit).
● Convert the base result to the
target unit using
IMeasurable.convertFromBaseUnit().
● Round the result to two decimal
places for consistency.
5. Return New Quantity
● Create and return a
new Quantity<U> object with the
subtracted value and target unit.
● Original objects remain
unchanged (immutability
principle).
6. Cross-Category Type Safety
● Positive result indicates the first
operand is larger.
● Negative result indicates the
second operand is larger.
● Zero result indicates quantities are
equivalent.
Division Operations
1. User Initiates Division
● Client
calls Quantity<U>.divide(Quantity<U> other).
● Method accepts another quantity
and returns a dimensionless
scalar.
2. Input Validation
● Verify that other is non-null and
has a valid unit.
● Verify that both quantities belong
to the same measurement
category.
● Verify that all numeric values are
finite.
● Verify that the divisor (other) is
not zero (prevent division by
zero).
3. Conversion to Base Unit
● Convert both this and other to the
common base unit.
● Divide the base values: result =
this.baseValue / other.baseValue.
4. Return Dimensionless Result
● Return the scalar result as a
primitive double.
● Result is dimensionless (no unit),
representing a pure ratio.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 3/22
5. Result Interpretation
● Result > 1.0 indicates first
operand is larger.
● Result < 1.0 indicates second
operand is larger.
● Result = 1.0 indicates quantities
are equivalent.
Postconditions
● Subtraction of two quantities produces a
new Quantity<U> object with the correct
difference.
● Result unit for subtraction is either the
first operand's unit (implicit) or explicitly
specified target unit.
● Original quantities remain unchanged;
subtraction follows immutability principle.
● Cross-category subtraction (e.g., feet -
kilograms) is prevented by type system.
● Division of two quantities returns a
dimensionless double scalar value.
● Division by zero results
in Double.POSITIVE_INFINITY or throws
an exception (design choice).
● All arithmetic operations (addition,
subtraction, division) coexist seamlessly.
● Demonstration methods in
QuantityMeasurementApp showcase all
operations.
● All previous functionality from UC1–
UC11 is preserved.
● Subtraction and division work across all
measurement categories (length, weight,
volume).
● Mathematical properties are respected:
subtraction is non-commutative, division
is non-commutative.
HINTS FOR IMPLEMENTING UC10:
Step 1 – Add Subtraction Methods to Quantity
Class
Implement two overloaded subtract() methods:
● Subtracts another quantity from this
quantity, returning result in this quantity's
unit.
● Subtracts another quantity from this
quantity, returning result in specified
target unit.
Step 2 –Add Division Method to Quantity Class
Implement divide() method:
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 4/22
● Divide another quantity from this
quantity,, returning the result in double.
Step 3 – Add Demonstration Methods
to QuantityMeasurementApp
Implement demonstration methods for
subtraction and division
Step 4 –Update Main Method in
QuantityMeasurementApp
Add demonstration calls for subtraction and
division
Step 5 – Add Comprehensive Unit Tests
Create test methods covering:
● Subtraction with same units
● Subtraction with different units
● Subtraction with explicit target unit
● Subtraction resulting in negative values
● Subtraction resulting in zero
● Division with same units
● Division with different units
● Division resulting in ratios > 1, < 1, = 1
● Division by zero handling
● Cross-category prevention
● Edge cases (zero, negative, large values)
Step 6 – Test Edge Cases and Error Handling
Verify behavior for:
● Null quantity arguments
● Null target unit arguments
● NaN and infinite values
● Division by zero
● Cross-category operations
● Precision and rounding in results
Step 7 – Maintain Consistency with Addition
Ensure subtraction and division follow the same
patterns as addition:
● Implicit target unit (first operand's unit)
● Explicit target unit specification
● Immutability of operands
● Rounding to two decimal places
● Comprehensive validation
Step 8 – Test Edge Cases and Error Handling
Provide clear JavaDoc for:
● Method purpose and behavior
● Parameter descriptions
● Return value semantics
● Exceptions thrown
● Examples of usage
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 5/22
● Mathematical properties (non-
commutativity, etc.)
Step 9 – Integration Testing
Verify that subtraction and division:
● Work across all measurement categories
(length, weight, volume)
● Coexist with existing operations (equality,
conversion, addition)
● Maintain backward compatibility
● Scale to new categories without
modification
Code Snippet
UC12 Code Snippet 1.1 Quantity Class
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 6/22
UC12 Code Snippet 1.2 Quantity Class
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 7/22
UC12 Code Snippet 2.1
QuantityMeasurementApp Class
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 8/22
UC 12 Code Snippet 2.2
QuantityMeasurementApp Class
Example Output of running the
App
Subtraction with Implicit Target Unit:
● Input: new Quantity<>(10.0,
FEET).subtract(new Quantity<>(6.0,
INCHES)) →  Output: Quantity(9.5, FEET)
● Input: new Quantity<>(10.0,
KILOGRAM).subtract(new Quantity<>
(5000.0, GRAM)) →  Output:
Quantity(5.0, KILOGRAM)
● Input: new Quantity<>(5.0,
LITRE).subtract(new Quantity<>(500.0,
MILLILITRE)) →  Output: Quantity(4.5,
LITRE)
Subtraction with Explicit Target Unit:
● Input: new Quantity<>(10.0,
FEET).subtract(new Quantity<>(6.0,
INCHES), INCHES) →  Output:
Quantity(114.0, INCHES)
● Input: new Quantity<>(10.0,
KILOGRAM).subtract(new Quantity<>
(5000.0, GRAM), GRAM) →  Output:
Quantity(5000.0, GRAM)
● Input: new Quantity<>(5.0,
LITRE).subtract(new Quantity<>(2.0,
LITRE), MILLILITRE) →  Output:
Quantity(3000.0, MILLILITRE)
Subtraction Resulting in Negative Values:
● Input: new Quantity<>(5.0,
FEET).subtract(new Quantity<>(10.0,
FEET)) →  Output: Quantity(-5.0, FEET)
● Input: new Quantity<>(2.0,
KILOGRAM).subtract(new Quantity<>
(5.0, KILOGRAM)) →  Output:
Quantity(-3.0, KILOGRAM)
Subtraction Resulting in Zero:
● Input: new Quantity<>(10.0,
FEET).subtract(new Quantity<>(120.0,
INCHES)) →  Output: Quantity(0.0,
FEET)
● Input: new Quantity<>(1.0,
LITRE).subtract(new Quantity<>(1000.0,
MILLILITRE)) →  Output: Quantity(0.0,
LITRE)
Division Operations:
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 9/22
● Input: new Quantity<>(10.0,
FEET).divide(new Quantity<>(2.0, FEET))
→  Output: 5.0
● Input: new Quantity<>(10.0,
FEET).divide(new Quantity<>(5.0, FEET))
→  Output: 2.0
● Input: new Quantity<>(24.0,
INCHES).divide(new Quantity<>(2.0,
FEET)) →  Output: 1.0
● Input: new Quantity<>(10.0,
KILOGRAM).divide(new Quantity<>(5.0,
KILOGRAM)) →  Output: 2.0
● Input: new Quantity<>(5.0,
LITRE).divide(new Quantity<>(10.0,
LITRE)) →  Output: 0.5
Division with Different Units (Same
Category):
● Input: new Quantity<>(12.0,
INCHES).divide(new Quantity<>(1.0,
FEET)) →  Output: 1.0
● Input: new Quantity<>(2000.0,
GRAM).divide(new Quantity<>(1.0,
KILOGRAM)) →  Output: 2.0
● Input: new Quantity<>(1000.0,
MILLILITRE).divide(new Quantity<>(1.0,
LITRE)) →  Output: 1.0
Error Cases:
● Input: new Quantity<>(10.0,
FEET).subtract(null) →  Throws
IllegalArgumentException
● Input: new Quantity<>(10.0,
FEET).divide(new Quantity<>(0.0, FEET))
→  Throws ArithmeticException
● Input: new Quantity<>(10.0,
FEET).subtract(new Quantity<>(5.0,
KILOGRAM)) →  Throws
IllegalArgumentException (cross-
category)
Concepts Learned byImplementing UC12:
1. Comprehensive Arithmetic Operations
● Quantity system evolves fromcomparison/conversion to fullarithmetic support.● Multiple operations (add,subtract, divide) share commonpatterns and validation.● Design accommodates operationdiversity without fundamentalrestructuring.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 10/22
2. Immutability in Arithmetic
● All arithmetic operations returnnew objects; originals remainunchanged.● Enables safe concurrent usageand prevents unintended sideeffects.● Functional programmingparadigm applied to domainobjects.
3. Non-Commutative Operations
● Subtraction and division areorder-dependent; swappingoperands changes the result.● Testing must verify non-commutativity (unlike commutativeaddition).
● Mathematical properties influencetest design and expectedoutcomes.
4. Division by Zero Handling
● Design choice: throw exceptionvs. return infinity/NaN.● Exception approach preferred forrobustness (fail-fast principle).● Validation prevents silent logicerrors in downstream code.
5. Target Unit Specification Pattern
● Consistent overloading acrossoperations (implicit vs. explicittarget unit).
● Implicit default to first operand'sunit for readability.● Explicit specification providesflexibility for specific use cases.
6. Cross-Category Type Safety
● Subtraction and division areprevented between differentmeasurement categories.● Type checking via unit.getClass()applies uniformly across alloperations.● Compile-time and runtime checksprovide layered safety.
7. Private Helper Methods for CodeReuse
● Shared arithmetic logic(conversion, operation, resultpreparation) reduces duplication.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 11/22
● Enum-based operation dispatch(ArithmeticOperation)encapsulates operation logic.● Improves maintainability ifadditional operations are addedlater.
8. Validation Consistency
● All operations perform identicalvalidation checks (null, category,finiteness).● Centralized validation patternsprevent missed edge cases.● Clear error messages aiddebugging and userunderstanding.
9. Precision Handling Across Operations
● Rounding to two decimal placesmaintains consistency.
● Applies to subtraction (returnsQuantity); division returns rawdouble.
● Epsilon-based comparison maydiffer between operation types.
10.Method Overloading for Usability
● Multiple method signaturesaccommodate different callerneeds.● Overloading enables intuitive APIwithout excessive method names.● Consistency with additionoperation improves APIlearnability.
11.Polymorphic Demonstration Methods
● Generic <U extends
IMeasurable> methods work
across all categories.
● Single demonstration methodhandles length, weight, volume,and future categories.● Eliminates method explosion ascategories grow.
12.Validate Design Violations
● Is any of the SOLID DesignPrinciples Violated or ObjectCalisthenics violated
● If Yes, highlight the violation andhave plans to fix it.
Key Concepts Tested:
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 12/22
1. Subtraction with Same Units
● Two quantities in the same unitsubtract correctly.
● Result is in the first operand's unitby default.
● Validates arithmetic accuracy.
2. Subtraction with Different Units (SameCategory)
● Two quantities in different unitsare converted and subtractedcorrectly.● Result is in the first operand's unit(implicit target).● Tests conversion integration witharithmetic.
3. Subtraction with Explicit Target Unit
● Result can be expressed in anysupported unit.● Explicit target unit overridesdefault first operand unit.● Verifies target unit parameterhandling.
4. Subtraction Non-Commutativity
● A.subtract(B) ≠  B.subtract(A)(order matters).● Result sign changes whenoperands are swapped.● Tests mathematical propertyawareness.
5. Subtraction Resulting in NegativeValues
● Negative results are handledcorrectly.
● Sign is preserved in conversions.● Tests range coverage beyondpositive results.
6. Subtraction Resulting in Zero
● Subtracting equivalent quantitiesyields zero.● Zero is represented consistentlyacross units.● Validates equivalence detectionthrough arithmetic.
7. Subtraction with Zero Operand
● Subtracting zero returns theoriginal quantity.
● Acts as identity element forsubtraction.● Tests identity property.
8. Subtraction with Negative Operands
● Subtraction works correctly withnegative values.● Subtracting negative quantity isequivalent to adding.● Tests negative number handling.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 13/22
9. Division with Same Units
● Two quantities in the same unitdivide correctly.
● Result is dimensionless scalar.● Validates fundamental ratiocalculation.
10.Division with Different Units (SameCategory)
● Two quantities in different unitsdivide correctly.
● Units cancel out; result isdimensionless.
● Tests conversion integration.
11.Division Non-Commutativity
● A.divide(B) ≠  B.divide(A) (ordermatters).
● Result is reciprocal whenoperands are swapped.● Tests mathematical property.
12.Division Resulting in Ratio > 1.0
● First operand is larger thansecond.● Result correctly represents "howmany times larger."● Tests greater-than case.
13.Division Resulting in Ratio < 1.0
● First operand is smaller thansecond.
● Result correctly represents"fractional multiple."
● Tests less-than case.
14.Division Resulting in Ratio = 1.0
● First operand equals secondoperand.
● Result is exactly 1.0 (withinepsilon).● Tests equivalence detection.
15.Division by Zero Prevention
● Dividing by zero quantity throwsexception.● Prevents silent Infinity or NaNresults.● Tests error handling robustness.
16.Division Resulting in Very Large Ratios
● Handles extreme magnitudedifferences (e.g., 1,000,000 ÷ 1).
● Precision maintained across largenumbers.● Tests floating-point handling.
17.Division Resulting in Very Small Ratios
● Handles small magnitude results(e.g., 1 ÷ 1,000,000).
● Precision maintained across smallnumbers.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 14/22
● Tests floating-point accuracy at lowmagnitude.
18.Cross-Category Subtraction Prevention
● Subtracting weight from lengththrows exception.
● Prevents logically invalidoperations.● Tests type safety.
19.Cross-Category Division Prevention
● Dividing length by weight throwsexception.
● Prevents category mixing.● Tests category isolation.
20.Null Operand Handling (Subtraction)
● Subtracting null quantity throwsexception.● Prevents null pointer errors.
● Tests null safety.
21.Null Operand Handling (Division)
● Dividing by null quantity throwsexception.
● Prevents null pointer errors.● Tests null safety.
22.Null Target Unit Handling(Subtraction)
● Specifying null as target unitthrows exception.
● Prevents invalid unit usage.● Tests parameter validation.
23.Precision and Rounding (Subtraction)
● Subtraction results are rounded totwo decimal places.● Consistent with other operations.
● Tests precision consistency.
24.Precision and Rounding (Division)
● Division results maintain floating-point precision.● No arbitrary rounding fordimensionless results.
● Tests return type handlingdifferences.
25.Immutability After Subtraction
● Original quantities are unchangedafter subtraction.● New object returned; originalspreserved.● Tests immutability principle.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 15/22
26.Immutability After Division
● Original quantities are unchangedafter division.● Only scalar result returned;originals preserved.● Tests immutability principle.
27.Integration with Addition
● Subtraction and additionoperations coexist withoutconflict.
● Mathematical inverse relationship:A + B - B = A.● Tests operation consistency.
28.All Measurement Categories (Length,Weight, Volume)
● Subtraction and division work forall category types.● Generic methods handle diversitytransparently.● Tests scalability across categories.
29.Subtraction Chain Operations
● Multiple subtractions can bechained:A.subtract(B).subtract(C).
● Each result is a valid Quantity.● Tests method chaining support.
30.Division Associativity Test
● (A ÷ B) ÷ C ≠  A ÷ (B ÷ C) (non-associative).● Validates mathematical propertyawareness.● Tests operation order importance.
Test Case Examples:
1. testSubtraction_SameUnit_FeetMinusFeet()–
● Verifies that new Quantity<>(10.0, FEET).subtract(newQuantity<>(5.0, FEET)) returnsQuantity(5.0, FEET).
● Tests: Same-unit subtractionwithout conversion.
2. testSubtraction_SameUnit_LitreMinusLitre()–
● Verifies that new Quantity<>(10.0, LITRE).subtract(newQuantity<>(3.0, LITRE)) returnsQuantity(7.0, LITRE).● Tests: Same-unit subtraction forvolume.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 16/22
3. testSubtraction_CrossUnit_FeetMinusInches()–
● Verifies that new Quantity<>(10.0, FEET).subtract(newQuantity<>(6.0, INCHES)) returnsQuantity(9.5, FEET).
● Tests: Cross-unit subtraction withresult in feet.
4. testSubtraction_CrossUnit_InchesMinusFeet()
● Verifies that new Quantity<>(120.0, INCHES).subtract(newQuantity<>(5.0, FEET)) returnsQuantity(60.0, INCHES).
● Tests: Cross-unit subtraction withresult in inches.
5. testSubtraction_ExplicitTargetUnit_Feet()
● Verifies that new Quantity<>(10.0, FEET).subtract(newQuantity<>(6.0, INCHES), FEET)returns Quantity(9.5, FEET).
● Tests: Explicit target unitspecification in feet.
6. testSubtraction_ExplicitTargetUnit_Inches()
● Verifies that new Quantity<>(10.0, FEET).subtract(newQuantity<>(6.0, INCHES),INCHES) returns Quantity(114.0,INCHES).● Tests: Explicit target unitspecification in inches.
7. testSubtraction_ExplicitTargetUnit_Millilitre()
● Verifies that new Quantity<>(5.0,LITRE).subtract(new Quantity<>(2.0, LITRE), MILLILITRE) returnsQuantity(3000.0, MILLILITRE).
● Tests: Explicit target unitspecification in millilitre.
8. testSubtraction_ResultingInNegative()
● Verifies that new Quantity<>(5.0,FEET).subtract(new Quantity<>(10.0, FEET)) returnsQuantity(-5.0, FEET).● Tests: Subtraction resulting innegative values.
9. testSubtraction_ResultingInZero()
● Verifies that new Quantity<>(10.0, FEET).subtract(newQuantity<>(120.0, INCHES))returns Quantity(0.0, FEET).● Tests: Subtraction resulting inzero.
10.testSubtraction_WithZeroOperand()
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 17/22
● Verifies that new Quantity<>(5.0,FEET).subtract(new Quantity<>(0.0, INCHES)) returnsQuantity(5.0, FEET).
● Tests: Identity element property.
11.testSubtraction_WithNegativeValues()
● Verifies that new Quantity<>(5.0,FEET).subtract(new Quantity<>(-2.0, FEET)) returns Quantity(7.0,FEET).● Tests: Subtraction with negativeoperands.
12.testSubtraction_NonCommutative()
● Verifies that A.subtract(B) ≠B.subtract(A).● Tests: new Quantity<>(10.0,FEET).subtract(new Quantity<>(5.0, FEET)) returns 5.0 whilereverse returns -5.0.
13.testSubtraction_WithLargeValues()
● Verifies that new Quantity<>(1e6,KILOGRAM).subtract(newQuantity<>(5e5,KILOGRAM)) returnsQuantity(5e5, KILOGRAM).
● Tests: Large magnitudesubtraction.
14.testSubtraction_WithSmallValues()
● Verifies that new Quantity<>(0.001, FEET).subtract(newQuantity<>(0.0005,FEET)) returns Quantity(~0.0005,FEET).● Tests: Small magnitude subtractionwith precision.
15.testSubtraction_NullOperand()
● Verifies that new Quantity<>(10.0, FEET).subtract(null) throwsIllegalArgumentException.
● Tests: Null operand validation.
16.testSubtraction_NullTargetUnit()
● Verifies that new Quantity<>(10.0, FEET).subtract(newQuantity<>(5.0, FEET), null)throws IllegalArgumentException.● Tests: Null target unit validation.
17.testSubtraction_CrossCategory()
● Verifies that new Quantity<>(10.0, FEET).subtract(newQuantity<>(5.0,KILOGRAM)) throwsIllegalArgumentException.
● Tests: Cross-category prevention.
18.testSubtraction_AllMeasurementCategories()
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 18/22
● Verifies subtraction works forlength, weight, and volume.
● Tests: Scalability acrosscategories.
19.testSubtraction_ChainedOperations()
● Verifies that new Quantity<>(10.0, FEET).subtract(newQuantity<>(2.0,FEET)).subtract(new Quantity<>(1.0, FEET)) returns Quantity(7.0,FEET).
● Tests: Method chaining support.
20.testDivision_SameUnit_FeetDividedByFeet()
● Verifies that new Quantity<>(10.0, FEET).divide(newQuantity<>(2.0, FEET)) returns5.0.● Tests: Same-unit division withoutconversion.
21.testDivision_SameUnit_LitreDividedByLitre()
● Verifies that new Quantity<>(10.0, LITRE).divide(newQuantity<>(5.0, LITRE)) returns2.0.● Tests: Same-unit division forvolume.
22.testDivision_CrossUnit_FeetDividedByInches()
● Verifies that new Quantity<>(24.0, INCHES).divide(newQuantity<>(2.0, FEET)) returns1.0.● Tests: Cross-unit division withcorrect conversion.
23.testDivision_CrossUnit_KilogramDividedByGram()
● Verifies that new Quantity<>(2.0,KILOGRAM).divide(newQuantity<>(2000.0, GRAM))returns 1.0.
● Tests: Cross-unit division forweight.
24.testDivision_RatioGreaterThanOne()
● Verifies that new Quantity<>(10.0, FEET).divide(newQuantity<>(2.0, FEET)) returns5.0.● Tests: Ratio > 1.0 case.
25.testDivision_RatioLessThanOne()
● Verifies that new Quantity<>(5.0,FEET).divide(new Quantity<>(10.0, FEET)) returns 0.5.● Tests: Ratio < 1.0 case.
26.testDivision_RatioEqualToOne()
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 19/22
● Verifies that new Quantity<>(10.0, FEET).divide(newQuantity<>(10.0, FEET)) returns1.0.
● Tests: Equivalence detectionthrough division.
27.testDivision_NonCommutative()
● Verifies that A.divide(B) ≠B.divide(A).
● Tests: new Quantity<>(10.0,FEET).divide(new Quantity<>(5.0,FEET)) returns 2.0 while reversereturns 0.5.
28.testDivision_ByZero()
● Verifies that new Quantity<>(10.0, FEET).divide(newQuantity<>(0.0, FEET)) throwsArithmeticException.
● Tests: Division by zero prevention.
29.testDivision_WithLargeRatio()
● Verifies that new Quantity<>(1e6,KILOGRAM).divide(newQuantity<>(1.0,KILOGRAM)) returns 1e6.● Tests: Very large ratios.
30.testDivision_WithSmallRatio()
● Verifies that new Quantity<>(1.0,KILOGRAM).divide(newQuantity<>(1e6,KILOGRAM)) returns 1e-6.● Tests: Very small ratios andprecision.
31.testDivision_NullOperand()
● Verifies that new Quantity<>(10.0, FEET).divide(null) throwsIllegalArgumentException.
● Tests: Null operand validation.
32.testDivision_CrossCategory()
● Verifies that new Quantity<>(10.0, FEET).divide(newQuantity<>(5.0,KILOGRAM)) throwsIllegalArgumentException.
● Tests: Cross-category prevention.
33.testDivision_AllMeasurementCategories()
● Verifies division works for length,weight, and volume.● Tests: Scalability acrosscategories.
34.testDivision_Associativity()
● Verifies that (A ÷ B) ÷ C ≠  A ÷ (B÷ C) (non-associative).
● Tests: Mathematical propertyawareness.
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 20/22
35.testSubtractionAndDivision_Integration()
● Verifies that subtraction anddivision operations coexist withoutconflict.● Example: A.subtract(B).divide(C)is valid.
● Tests: Operation integration.
36.testSubtractionAddition_Inverse()
● Verifies that A.add(B).subtract(B)approximately equals A.
● Tests: Mathematical inverserelationship.
37.testSubtraction_Immutability()
● Verifies that original quantities areunchanged after subtraction.● Tests: Immutability principle.
38.testDivision_Immutability()● Verifies that original quantities areunchanged after division.
● Tests: Immutability principle.
39.testSubtraction_PrecisionAndRounding()
● Verifies that subtraction results arerounded to two decimal places.
● Tests: Precision consistency.
40.testDivision_PrecisionHandling()● Verifies that division resultsmaintain floating-point precision.
● Tests: Dimensionless resulthandling.
Code Snippet for Test Cases
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 21/22
UC12 QuantityMeasurementApp Test Results
Published using Google Docs Report abuse Learn more
UC12: Subtraction and Division Operations on Quantity Measurements Updated automatically every 5minutes
19/06/2026, 08:43 UC12: Subtraction and Division Operations on Quantity Measurements
https://docs.google.com/document/d/e/2PACX-1vRcTtPNWt4nTYOcGtmutyuwu8Elkpl_1kDD2MefU1I3vAZEUVd8CoYwSXMm-YxqG3K4afyMn… 22/22


---
# UC13_ Centralized Arithmetic Logic to Enforce DRY in Quantity Operations(1)

UC13: CentralizedArithmetic Logic toEnforce DRY in QuantityOperations
Description
UC13 refactors the arithmetic operations(addition, subtraction, division) implemented inUC12 to eliminate code duplication and enforcethe DRY (Don't Repeat Yourself) principle.Instead of repeating unit conversion, base-unitnormalization, and validation logic acrossmultiple arithmetic methods, this use caseintroduces a centralized private helper methodthat encapsulates all common arithmetic logic.
By consolidating the repetitive code into asingle, reusable helper method, UC13 improvesmaintainability, reduces bug risk, andestablishes a scalable pattern for adding futurearithmetic operations (multiplication, modulo,etc.) without duplicating logic. The public APIremains unchanged; all behaviors from UC12are preserved while the internal implementationis optimized for clarity and consistency.
Disadvantages of UC12Implementation
UC12's direct implementation of arithmeticoperations exhibits several architectural flaws:
1. Code Duplication Across ArithmeticMethods
● add(), subtract(), and divide()each contain nearly identicalcode:○ Null checks for operandand unit
○ Category typecompatibility verificationvia unit.getClass()○ Finiteness validation fornumeric values
○ Base-unit conversion viaIMeasurable.convertToBaseUnit()○ Explicit target unithandling
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 1/22
○ Explicit target unithandling
● Any of these checks present in allthree methods with minimalvariation.● Future arithmetic operations(multiplication, modulo, etc.)would duplicate this patternfurther.
2. DRY Principle Violation
● Common validation logic iscopied verbatim across methods.● Error messages and validationchecks are not centralized.
● Changes to validation rulesrequire updates in multiplelocations.● Inconsistencies between methodsbecome possible (e.g., onemethod uses different null-checkbehavior).
3. Increased Maintenance Burden
● Bug fixes or improvements toconversion logic must be appliedin three+ places.● Risk of partial updates (fixing onemethod while missing others).● Refactoring becomes complex aschanges ripple across multiplemethods.● New developers struggle tounderstand why logic is repeated.
4. Reduced Code Readability
● Length of each arithmetic methodobscures the core operationlogic.● Readers must parsevalidation/conversion boilerplatebefore understanding the actualarithmetic.
● Intent of the method is buried inrepetitive code.
5. Scalability Issues
● Adding multiplication, modulo, orother operations compoundsduplication.● Validation and conversion logicwould be replicated 5+, 6+, 7+times.● Codebase grows unnecessarily;complexity increases withoutadding functionality.
6. Inconsistent Error Handling
● Each method might handle errorsslightly differently.● Some might throw exceptions;others return special values.
● No centralized place to adjusterror-handling strategy.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 2/22
7. Testing Complexity
● Validation scenarios must betested separately for eachoperation.● Tests for add(), subtract(), anddivide() contain nearly identicaltest cases.● Bug fixes or validation changesrequire updating tests in multiplelocations.
Preconditions
● All arithmetic operations from UC12
(add, subtract, divide) are fully functional
and tested.
● All unit enums (LengthUnit, WeightUnit,
VolumeUnit, etc.) implement
IMeasurable.
● Behavior of arithmetic operations must
remain unchanged after refactoring.
● Existing test cases from UC12 will pass
without modification.
● The refactoring will be internal; public
API signatures remain identical.
● A centralized helper method will extract
common logic.
● Error handling and validation remain
consistent across all operations.
● Refactor will not change public method
signatures or results.
Main Flow
Step 1: Analyze Common Logic
● Identify validation steps shared acrossadd, subtract, divide:○ Null check on operand
○ Category type verification○ Finiteness validation for bothoperands○ Optional target unit validation
● Identify conversion logic sharedacross operations:
○ Convert this to base unit○ Convert operand to base unit
○ Perform arithmetic operation onbase values○ (For add/subtract) Convert resultback to target unit
Step 2: Design Arithmetic Operation Enum
● Create a private enum forArithmeticOperation○ ADD: Represents addition○ SUBTRACT: Representssubtraction
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 3/22
○ DIVIDE: Represents division○ MULTIPLY: (Optional for futureuse)
Step 3: Create Centralized Private Helper
Method
● Logic flow:○ Validate inputs (non-null, samecategory, finite values)○ Convert both operands to baseunit
○ Execute arithmetic based onArithmeticOperation type○ Return base-unit result
Step 4: Refactor Public Arithmetic Methods
● add(Quantity<U> other):
○ Calls helper with implicit targetunit (first operand's unit)○ Converts result to target unit
○ Returns new Quantity<U>
● add(Quantity<U> other, U targetUnit):○ Calls helper with explicit targetunit○ Converts result to target unit○ Returns new Quantity<U>
● subtract(Quantity<U> other):
○ Calls helper with implicit targetunit
○ Converts result to target unit○ Returns new Quantity<U>
● subtract(Quantity<U> other, UtargetUnit):
○ Calls helper with explicit targetunit
○ Converts result to target unit○ Returns new Quantity<U>
● divide(Quantity<U> other):○ Calls helper with irrelevant targetunit (not used for division)○ Returns dimensionless scalarwithout further conversion
Step 5: Ensure Backward Compatibility
● All public methods retain originalsignatures.● All results match UC12 behavior exactly.● Error handling and exceptions remainconsistent.● Existing test cases pass withoutmodification.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 4/22
Step 6: Validate Consistency
● Verify that validation errors are identicalacross operations.● Confirm that cross-category checks workuniformly.
● Test that division-by-zero handling iscorrect.● Validate rounding behavior foradd/subtract.
Postconditions
● All arithmetic operations (add, subtract,
divide) delegate to a centralized helper.
● Validation and conversion logic is
implemented once, in the helper.
● Code duplication across arithmetic
methods is eliminated.
● Public method signatures and behavior
remain unchanged.
● All UC12 test cases pass without
modification.
● Error handling is consistent across all
operations.
● Future arithmetic operations
(multiplication, modulo, etc.) can reuse
the same helper pattern.
● Maintainability is significantly improved;
changes to validation or conversion
affect all operations uniformly.
● Codebase complexity is reduced;
individual method length is shortened.
● DRY principle is enforced; no logic
duplication exists.
● Subtraction and division work across all
measurement categories (length, weight,
volume).
● Mathematical properties are respected:
subtraction is non-commutative, division
is non-commutative.
HINTS FOR IMPLEMENTING UC10:
Step 1 – Create ArithmeticOperation Enum
Arithmatic Operations can be Exhibited usingtwo methods. Both the methods must be tried tobuild a perspective.
● Abstract Interface Method - This is veryclean and useful for very complex logic. It’sa standard Java pattern that keeps the logictied directly to the constant without needingextra fields.
In this implementation Each enum constant(ADD, SUBTRACT, DIVIDE) defines the computemethod to perform the specific operation. Thecompute method is a must-implement methodthat takes the base unit values of the twoquantities and returns the result of the
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 5/22
operation. This design allows for a clean andextensible way to handle multiple arithmeticoperations without duplicating code. Here is thecode
● Lambda Expression Methods - The Lambdaversion is more modern and concise, but itcan get messy if the logic for each operationis many lines long.
Each enum constant implements the computemethod using a lambda expression to define thespecific arithmetic operation. This design allowsfor a clean and extensible way to handlemultiple arithmetic operations withoutduplicating code, adhering to the Open/ClosedPrinciple.
The lambda expressions is defined using theDoubleBinaryOperator functional interface,which takes two double values (the base unitvalues of the quantities) and returns a doubleresult after performing the specified operation.
The compute method is called in theperformArithmetic method to execute thedesired operation based on the enum constantpassed as an argument.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 6/22
Step 2 –Create Centralized Validation Helper
This method validates the following
● NULL values,
● compatibility of unit types, and
● finiteness of numeric values.
● It also validates the target unit if required
for addition and subtraction operations
private void
validateArithmeticOperands(Quantity<U> other,
U targetUnit, boolean targetUnitRequired)
Step 3 –Create Core Arithmetic Helper
Method
private double
performBaseArithmetic(Quantity<U> other,
 ArithmeticOperation operation)
Step 4 –Refactor Arithmatic Operations
Method
● Add methods
● Subtract methods
● Devide method
Step 5 – Update Demonstration Methods in
QuantityMeasurementApp
No changes required to public API methods;
internal refactoring only.
Code Snippet
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 7/22
UC13 Code Snippet 1.1 Quantity Class
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 8/22
UC13 Code Snippet 1.2 Quantity Class
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g7… 9/22
UC13 Code Snippet 1.2 Quantity Class
UC13 Code Snippet 1.4 Quantity Class
Example Output of running the
App
Addition Operations (Behavior Unchanged
from UC12):
● Input: new Quantity<>(1.0,
FEET).add(new Quantity<>(12.0,
INCHES)) →  Output: Quantity(2.0, FEET)
● Input: new Quantity<>(10.0,
KILOGRAM).add(new Quantity<>
(5000.0, GRAM), GRAM) →  Output:
Quantity(15000.0, GRAM)
● Internal: Calls
performBaseArithmetic(other, ADD) after
validation
Subtraction Operations (Behavior Unchanged
from UC12):
● Input: new Quantity<>(10.0,
FEET).subtract(new Quantity<>(6.0,
INCHES)) →  Output: Quantity(9.5, FEET)
● Input: new Quantity<>(5.0,
LITRE).subtract(new Quantity<>(2.0,
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 10/22
LITRE), MILLILITRE) →  Output:
Quantity(3000.0, MILLILITRE)
● Internal: Calls
performBaseArithmetic(other, SUBTRACT)
after validation
Division Operations (Behavior Unchanged
from UC12):
● Input: new Quantity<>(10.0,
FEET).divide(new Quantity<>(2.0, FEET))
→  Output: 5.0
● Input: new Quantity<>(24.0,
INCHES).divide(new Quantity<>(2.0,
FEET)) →  Output: 1.0
● Internal: Calls
performBaseArithmetic(other, DIVIDE)
and returns scalar
Error Cases (Consistent Across All
Operations):
● Input: new Quantity<>(10.0,
FEET).add(null) →  Throws
IllegalArgumentException with consistent
message
● Input: new Quantity<>(10.0,
FEET).subtract(new Quantity<>(5.0,
KILOGRAM)) →  Throws
IllegalArgumentException for cross-
category
● Input: new Quantity<>(10.0,
FEET).divide(new Quantity<>(0.0, FEET))
→  Throws ArithmeticException for
division by zero
Internal Flow Example:
q1.subtract(q2, FEET)
  ↓
validateArithmeticOperands(q2, FEET, true)
  ↓
performBaseArithmetic(q2, SUBTRACT)
  ↓
SUBTRACT.compute(q1.baseValue,
q2.baseValue)
  ↓
Convert result to FEET
  ↓
Return new Quantity<>(..., FEET)
Concepts Learned byImplementing UC12:
1. DRY Principle Enforcement
● Centralizing repetitive logic into asingle method eliminatesduplication.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 11/22
● Any future changes to validationor conversion affect all operationsuniformly.● Reduces bug surface andmaintenance overhead.
2. Lambda Expressions
● Lambda Expression is a conciseway to represent an "anonymousfunction"—a function that doesn'thave a name, doesn't belong to aspecific class on its own, and canbe passed around like a piece ofdata.
● In Java, lambdas were introducedto make "FunctionalProgramming" possible, allowingyou to treat logic as an argumentfor a method.
● The Anatomy of a Lambda: Alambda expression consists ofthree parts:
○ Argument List: The inputs(e.g., (a, b)).
○ The Arrow Token: The ->symbol, which separatesthe inputs from the logic.
○ The Body: The actual codeto be executed (e.g., a +b).
3. Functional Interface
● A Functional Interface is simplyany interface that has exactly oneabstract method described withannotation @FunctionalInterface
● The DoubleBinaryOperator usedin ArithmaticOperation is afunctional interface. Whichessentially means it takes twodouble values (the base unitvalues of the quantities) andreturns a double result afterperforming the specifiedoperation.
● The Lambda Syntex (a,b) -> a + bsees (a,b) as theDoubleBinaryOperator passed tothe constant object ADDconstructor.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 12/22
● The compiler looks atDoubleBinaryOperator and sees ithas one method:applyAsDouble(double left,double right)
● It checks your lambda: (a, b)matches the two doublesrequired, and a + b matches thedouble return type.
● The compiler "bridges" the two,effectively turning your lambdainto the implementation of thatinterface.
4. Enum-Based Operation Dispatch● Using an enum with abstractmethods enables type-safeoperation switching.
● Cleaner than if-else chains orswitch statements.● Scalable for adding newoperations (Multiply, Modulo,etc.).
5. Single Source of Truth● Validation logic defined once; alloperations benefit from updates.
● Reduces inconsistency risk acrossmethods.
● Simplifies bug fixes andimprovements.6. Separation of Concerns
● Public methods handle return typeand API consistency.
● Helper methods handlevalidation, conversion, andcomputation.
● Clear responsibilities improvecode organization.7. Consistent Error Handling
● All operations throw sameexceptions for same errors.
● Error messages are identical andmeaningful.● Debugging is simplified.
8. Method Extraction Refactoring● Identifying common patternsacross methods.● Extracting into reusable utilitymethods.
● Improving readability andmaintainability.
9. Parametric Polymorphism ThroughEnums● Enum types can be passed asparameters to control behavior.● Type-safe alternative to string-based dispatch.
● Supports future extensibility.10.Scalability for Future Operations
● Adding multiplication: CreateMULTIPLY enum constant.● No changes to validation orconversion logic needed.● Same pattern applied consistently.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 13/22
11.Testing Simplification● Validation tests can be writtenonce for all operations.● Operation-specific tests focus onarithmetic correctness.● Reduced test duplication.12.Code Readability Enhancement
● Public methods are now shorterand focused.
● Intent of each method isimmediately clear.● Boilerplate validation is abstractedaway.13.Refactoring Without BehavioralChange
● Internal restructuring improvescode quality.
● Public API and behavior remainidentical.● Existing tests pass withoutmodification (regression-free).14.Private Method Visibility
● Helper methods not accessibleoutside class.● Reduces API surface area.
● Implementation details protectedfrom misuse.
15.Builder Pattern Compatibility (Future)● Refactored structure supportsbuilder pattern if needed.
● Centralized logic makes builderimplementation easier.
● Extensibility for complexoperations.16.Validation Consistency Strategy
● Centralized validation ensures alloperations fail identically for badinputs.
● Improves user experience throughconsistent error messaging.
● Reduces support burden.
Key Concepts Tested:
1. Validation Consistency AcrossOperations
● All operations throw sameexception for null operands.
● All operations reject cross-category arithmetic.
● All operations validate finitenessidentically.
2. Helper Method Delegation
● add, subtract, divide correctlydelegate toperformBaseArithmetic.● Helper receives correctArithmeticOperation enum value.● Helper returns correct base-unitresult.
3. Enum-Based Operation Dispatch
● Each operation enum constantcomputes correctly.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 14/22
● ADD enum computes correctsum.
● SUBTRACT enum computescorrect difference.
● DIVIDE enum computes correctquotient.
4. Addition Behavior Preservation
● All UC12 addition tests passwithout modification.
● Implicit and explicit target unitspecifications work identically.
● Cross-unit addition producescorrect results.
5. Subtraction Behavior Preservation
● All UC12 subtraction tests passwithout modification.
● Implicit and explicit target unitspecifications work identically.
● Non-commutativity is preserved.
6. Division Behavior Preservation
● All UC12 division tests passwithout modification.
● Dimensionless scalar returned.● Division-by-zero throws exception.
7. Null Operand Handling
● validateArithmeticOperandsrejects null operand.
● Error message is clear andconsistent.
● Works for all operations.
8. Cross-Category Prevention
● unit.getClass() comparisonenforces category matching.● Applied uniformly invalidateArithmeticOperands.● Works for all operations.
9. Finiteness Validation
● Both this.value and other.valuevalidated.● Applied uniformly invalidateArithmeticOperands.● Works for all operations.
10.Base-Unit Conversion
● convertToBaseUnit() applied toboth operands.
● convertFromBaseUnit() applied toresult (for add/subtract).
● Conversion logic centralized inperformBaseArithmetic.
11.Rounding Consistency
● Results rounded to two decimalplaces (add/subtract).
● Division returns raw doublewithout rounding.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 15/22
● roundToTwoDecimals() appliedconsistently.
12.Immutability Preservation
● Original quantities unchangedafter any operation.● New objects returned; originalsunmodified.● Works for all operations.
13.Target Unit Specification
● Implicit target unit (first operand'sunit) works correctly.● Explicit target unit overridesimplicit.
● Both versions use same helpermethod.
14.Code Duplication Elimination
● Validation code appears once invalidateArithmeticOperands.● Conversion code appears once inperformBaseArithmetic.
● All operations reuse same logic.
15.Backward Compatibility
● All UC12 test cases pass withoutmodification.
● Public method signaturesunchanged.● Behavior is identical.
16.Scalability for Future Operations
● New arithmetic operations(Multiply, Modulo) can use samepattern.
● No changes to validation orconversion needed.● Enum-based approach scaleseasily.
17.Error Message Consistency
● All null-check errors have samemessage format.
● All cross-category errors haveconsistent messaging.
● All finiteness errors are identical.
18.Operation Enum Type Safety
● ArithmeticOperation enumprovides compile-time type safety.● Invalid operation values preventedat compile time.● Cleaner than magic strings.
19.Private Method Encapsulation
● Helper methods not accessibleoutside class.● Implementation details hiddenfrom clients.
● Reduces API surface area.
20.Unified Error Handling Strategy
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 16/22
● All exceptions thrown from samevalidation point.
● Exception types consistent acrossoperations.
● Debugging simplified.
Test Case Examples:
1. testRefactoring_Add_DelegatesViaHelper()–
● Verifies that add() callsperformBaseArithmetic with ADDenum.● Tests: Helper delegation workscorrectly.
2. testRefactoring_Subtract_DelegatesViaHelper()
● Verifies that subtract() callsperformBaseArithmetic withSUBTRACT enum.
● Tests: Helper delegation workscorrectly.
3. testRefactoring_Divide_DelegatesViaHelper()
● Verifies that divide() callsperformBaseArithmetic withDIVIDE enum.● Tests: Helper delegation workscorrectly.
4. testValidation_NullOperand_ConsistentAcrossOperations()
● Verifies that add(null),subtract(null), divide(null) allthrow with same message.
● Tests: Validation consistency.
5. testValidation_CrossCategory_ConsistentAcrossOperations()
● Verifies that cross-category checkswork identically for all operations.
● Tests: Category validationcentralization.
6. testValidation_FiniteValue_ConsistentAcrossOperations()
● Verifies that NaN and infinitevalue checks apply to alloperations.● Tests: Finiteness validationconsistency.
7. testValidation_NullTargetUnit_AddSubtractReject()
● Verifies that explicit null targetunit throws exception.● Tests: Target unit validation foradd/subtract.
8. testArithmeticOperation_Add_EnumComputation()
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 17/22
● Verifies that ADD.compute(10, 5)returns 15.0.
● Tests: Enum operation logic.
9. testArithmeticOperation_Subtract_EnumComputation()
● Verifies thatSUBTRACT.compute(10, 5) returns5.0.● Tests: Enum operation logic.
10.testArithmeticOperation_Divide_EnumComputation()
● Verifies that DIVIDE.compute(10,5) returns 2.0.
● Tests: Enum operation logic.
11.testArithmeticOperation_DivideByZero_EnumThrows()
● Verifies that DIVIDE.compute(10,0) throws ArithmeticException.● Tests: Enum-level validation.
12.testPerformBaseArithmetic_ConversionAndOperation()
● Verifies that helper correctlyconverts both operands andperforms operation.
● Tests: Helper correctness.
13.testAdd_UC12_BehaviorPreserved()
● Runs all UC12 addition test casesunchanged.● Tests: Backward compatibility.
14.testSubtract_UC12_BehaviorPreserved()
● Runs all UC12 subtraction testcases unchanged.● Tests: Backward compatibility.
15.testDivide_UC12_BehaviorPreserved()
● Runs all UC12 division test casesunchanged.● Tests: Backward compatibility.
16.testRounding_AddSubtract_TwoDecimalPlaces()
● Verifies that add/subtract resultsare rounded to two decimals.
● Tests: Rounding consistency viahelper.
17.testRounding_Divide_NoRounding()
● Verifies that divide returns rawdouble without rounding.● Tests: Different handling fordimensionless results.
18.testImplicitTargetUnit_AddSubtract()
● Verifies that add/subtract withoutexplicit target unit use firstoperand's unit.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 18/22
● Tests: Implicit target unit behavior.
19.testExplicitTargetUnit_AddSubtract_Overrides()
● Verifies that explicit target unitoverrides first operand's unit.
● Tests: Explicit target unit behavior.
20.testImmutability_AfterAdd_ViaCentralizedHelper()
● Verifies that original quantitiesunchanged after addition.● Tests: Immutability throughrefactored implementation.
21.testImmutability_AfterSubtract_ViaCentralizedHelper()
● Verifies that original quantitiesunchanged after subtraction.
● Tests: Immutability throughrefactored implementation.
22.testImmutability_AfterDivide_ViaCentralizedHelper()
● Verifies that original quantitiesunchanged after division.
● Tests: Immutability throughrefactored implementation.
23.testAllOperations_AcrossAllCategories()
● Verifies add/subtract/divide workfor length, weight, volume.
● Tests: Scalability acrosscategories.
24.testCodeDuplication_ValidationLogic_Eliminated()
● Inspect source code; verifyvalidation logic appears only inhelper.● Tests: DRY principle enforcement.
25.testCodeDuplication_ConversionLogic_Eliminated()
● Inspect source code; verifyconversion logic appears only inhelper.● Tests: Centralization ofconversion.
26.testEnumDispatch_AllOperations_CorrectlyDispatched()
● Verify each operation uses correctenum constant.
● Tests: Enum-based dispatchcorrectness.
27.testFutureOperation_MultiplicationPattern()
● Create test for hypotheticalMULTIPLY operation using samepattern.
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 19/22
● Tests: Scalability for futureoperations.
28.testErrorMessage_Consistency_Across_Operations()
● Compare error messages fromadd/subtract/divide for sameerror type.
● Tests: Consistent error reporting.
29.testHelper_PrivateVisibility()
● Verify that performBaseArithmeticis private (compile-time check).● Tests: Encapsulation.
30.testValidation_Helper_PrivateVisibility()
● Verify thatvalidateArithmeticOperands isprivate.
● Tests: Encapsulation.
31.testRounding_Helper_Accuracy()
● VerifyroundToTwoDecimals(1.234567)returns 1.23.
● Tests: Rounding helpercorrectness.
32.testArithmetic_Chain_Operations()
● Verifyq1.add(q2).subtract(q3).divide(q4)chains correctly.● Tests: Operation compositionthrough refactored methods.
33.testRefactoring_NoBehaviorChange_LargeDataset()
● Run comprehensive test suite fromUC12 with 1000+ operations.
● Tests: Behavioral equivalence atscale.
34.testRefactoring_Performance_ComparableToUC12()
● Benchmark refactored vs. UC12implementation.
● Tests: No performance regressionfrom refactoring.
35.testEnumConstant_ADD_CorrectlyAdds()
● Direct test:ArithmeticOperation.ADD.compute(7,3) returns 10.0.
36.testEnumConstant_SUBTRACT_CorrectlySubtracts()
● Direct test:ArithmeticOperation.SUBTRACT.compute(7,3) returns 4.0.
37.testEnumConstant_DIVIDE_CorrectlyDivides()
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 20/22
● Direct test:ArithmeticOperation.DIVIDE.compute(7,2) returns 3.5.
38.testHelper_BaseUnitConversion_Correct()
● Verify performBaseArithmeticcorrectly converts to base unitbefore operation.
39.testHelper_ResultConversion_Correct()
● Verify the result is correctlyconverted from base unit to targetunit (for add/subtract).
40.testRefactoring_Validation_UnifiedBehavior()
● All operations reject the sameinvalid inputs with consistentmessages.
Code Snippet for Test Cases
UC 13 Unit Test Results
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 21/22
Published using Google Docs Report abuse Learn more
UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity OperationsUpdated automatically every 5minutes
19/06/2026, 08:43 UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations
https://docs.google.com/document/d/e/2PACX-1vQjoI5uNlCbiXNXGXZXRiZpv7XDDDS_6fj5Dk1BF_N00y4Nok9V85DeSzTe8o35bpkfJqPTR_g… 22/22


---
# UC14_ Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring(1)

UC14: TemperatureMeasurement withSelective ArithmeticSupport and IMeasurableRefactoring
Description
UC14 extends the Quantity MeasurementApplication to support temperaturemeasurements alongside length, weight, andvolume. Unlike these three categories, whichsupport full arithmetic operations (addition,subtraction, division), temperature presents aunique challenge: temperature differences canbe added or subtracted, but individualtemperature values cannot be meaningfullymultiplied or divided in most practical contexts.
More importantly, UC14 reveals a fundamentallimitation in the current IMeasurable interfacedesign: the interface does not account foroperations that are unsupported by certainmeasurement categories. Temperature cannotperform division operations (dividing 100°C by50°C yields a meaningless result), andmultiplying temperatures is equally nonsensical.
To address this, UC14 refactors the IMeasurableinterface to make arithmetic operations optionalthrough default methods. This design allows:
● TemperatureUnit enum to implementIMeasurable and support only conversionand equality.● LengthUnit, WeightUnit, andVolumeUnit to continue supporting allarithmetic operations.● Quantity class to gracefully handleunsupported operations, either bythrowing meaningful exceptions orproviding no-op implementations.
This use case demonstrates how to extend ageneric system to accommodate measurementcategories with fundamentally differentoperational constraints while maintaining typesafety and adhering to SOLID principles.
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 1/24
Disadvantages of UC12Implementation
While UC13 successfully centralized arithmeticlogic, it assumes all measurement categoriessupport the same set of operations. UC14reveals several limitations:
1. IMeasurable Interface AssumesUniform Operations
● The current IMeasurable interfaceprovides only conversionmethods.
● No provision for operations thatare unsupported by certaincategories.
● Interface does not distinguishbetween categories thatsupport/don't support arithmetic.
● Adding temperature withoutmodification would requiredummy arithmeticimplementations.
2. Quantity Assumes All Units SupportArithmetic
● add(), subtract(), divide() methodsassume all U support theseoperations.
● No mechanism to indicate "thisoperation is not supported for thisunit type."
● The temperature unit would beforced to throw exceptions atruntime.● The type system doesn'tcommunicate operationalconstraints at compile-time.
3. Lack of Interface Segregation
● IMeasurable combines conversionand operation support in amonolithic interface.● Violates the InterfaceSegregation Principle (ISP).
● A category supporting onlyconversion (like temperature) mustimplement all interface methods.● Future categories with differentconstraints become problematic.
4. No Compile-Time ConstraintCommunication
● Callers cannot determine atcompile-time which operations arevalid for a category.● new Quantity<>(50,CELSIUS).divide(...) compiles butfails at runtime.● Error handling must be defensivethroughout the codebase.
5. Operational Constraints Hidden fromAPI
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 2/24
● Public methods don'tcommunicate which operationsare supported.● Developers must consult thedocumentation to know thelimitations.● No compiler support for safeoperation selection.
6. Code Duplication for UnsupportedOperations
● Temperature would requiredummy implementations orrepeated exception-throwingcode.
● Validation logic duplicated acrosstemperature-specific branches.
● DRY principle violated foroperation constraint handling.
7. Testing Complexity
● Tests must verify behavior for bothsupported and unsupportedoperations.● Separate test branches fortemperature vs. other categories.● Exception handling tests areduplicated.
Preconditions
● All functionality from UC1–UC13
(equality, conversion, addition,
subtraction, division) is fully operational.
● The IMeasurable interface currently
provides only conversion-related
methods.
● LengthUnit, WeightUnit, and
VolumeUnit are fully implemented with
IMeasurable.
● The centralized arithmetic logic from
UC13 is in place with the
ArithmeticOperation enum.
● A new TemperatureUnit enum will be
created to support Celsius and
Fahrenheit
● The IMeasurable interface must be
refactored to make arithmetic operations
optional.
● The Quantity<U> class must be
enhanced to handle temperature-specific
constraints.
● Temperature conversions follow standard
formulas (Celsius ↔  Fahrenheit).
● Cross-category comparisons remain
prohibited (temperature cannot be
compared with length/weight/volume).
● All existing test cases from UC1–UC13
must pass without modification.
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 3/24
Main Flow
Step 1: Analyze Temperature Characteristics
● Supported Operations: Equalitycomparison, unit conversion.● Unsupported Operations: Division(meaningless), multiplication (notapplicable).
● PartiallySupported: Addition/subtractionrequires special handling due to absolutevs. relative temperatures.○ Can subtract two temperatures toget a temperature difference.○ Cannot add two absolutetemperatures (100°C + 50°C ≠150°C ina  meaningful sense).○ Can add a temperature differenceto a temperature.
Step 2: Refactor IMeasurable Interface
● Add default methods for operations thatmay not be supported by all categories.
● Define methods that throwUnsupportedOperationException bydefault.● Allow categories to override only theoperations they support.
● Provide a method to query whichoperations are supported.
Refactored IMeasurable Interface:
● Add a default method to validatearithmetic operation, as in default voidvalidateOperationSupport(Stringoperation). The default implementationdoes nothing, allowing all units tosupport all operations by default.Subclasses like TemperatureUnit canoverride this method to throw anexception if a specific operation, likeaddition or subtraction, is not supported.
● Add a functional interface to indicatewhether a measurable unit supportsarithmetic operations. This is used todetermine if addition or other operationsare valid for a given unit type. FunctionalInterface allows for more concise andflexible code through the use of lambdaexpressions.
@FunctionalInterfacepublic interface SupportsArithmetic {    boolean isSupported();}
Step 3: Lambda Expression
● Ensure LengthUnit is defining LambdaExpression for SupportsArithmeticFunctional Interface as shown in the code
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 4/24
SupportsArithmetic supportsArithmetic =() -> true;
● Similarly, VolumeUnit, WeightUnit, andTemperatureUnit should define theLambda Expression
Step 4: Create TemperatureUnit Enum
● Define constants: CELSIUS, FAHRENHEIT● Implement IMeasurable interface.
● Define Functional Interface and LambdaExpression for Fahrenheit to Celsiusconversion and for Celsius to Celsiusconversion (identity function). Here is thesample final Function<Double, Double>CELSIUS_TO_CELSIUS = (celsius) ->celsius;
● Lambda expression to indicate thatTemperatureUnit does not supportarithmetic operations in a meaningfulway, so we set this tofalse SupportsArithmeticsupportsArithmetic = () -> false;● Implement conversion methods withtemperature-specific formulas.
● Override validateOperationSupport() toprovide clear error messages.
Step 5: Enhance Quantity Class
● Modify arithmetic methods to validateoperation support upfront. This meansensuring addition, subtraction, anddivision methods check if arithmeticoperations can be performed beforefurther processing by callingvalidateOperationSupport as in codethis.unit.validateOperationSupport(operation.name());
● Modify the Conversion Method to checkif it is for the Temperature Unit or others.If it is a Temperature Unit a, then specialhandling is needed
Step 6: Formulas for Temperature
Conversions
● Verify that validation errors are identicalacross operations.● Confirm that cross-category checks workuniformly.
● Test that division-by-zero handling iscorrect.
● Validate rounding behavior foradd/subtract.
Step 7: Ensure Cross-Category Type Safety
● Temperature cannot be compared withlength, weight, or volume.● equals() method checks unit.getClass() toprevent cross-category comparison.
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 5/24
● Compile-time type checking via genericsprevents accidental mixing.
Step 8: Add Demonstration Methods
● Demonstrate temperature equality (sameand different units).
● Demonstrate temperature conversion (allunit pairs).● Attempt to demonstrate unsupportedoperations to showcase error handling.● Show that temperature integrates withexisting systems without modification toQuantity.
Step 9: Implement Comprehensive Test
Coverage
● Temperature equality across units.● Temperature conversion accuracy.
● Unsupported operation handling.● Cross-category prevention.
● Edge cases and precision handling.
Postconditions
● The TemperatureUnit enum supports
CELSIUS, FAHRENHEIT, and KELVIN with
accurate conversion formulas.
● IMeasurable interface now includes
optional operation support methods
(default methods).
● Quantity<U> class validates operation
support before execution.
● Temperature measurements support
equality comparison and conversion.
● Temperature measurements throw
UnsupportedOperationException for
unsupported arithmetic operations.
● All UC1–UC13 test cases pass without
modification.
● Cross-category type safety is maintained;
temperature cannot be compared with
other categories.
● Error messages clearly indicate why an
operation is unsupported.
● The interface and implementation follow
SOLID principles, especially Interface
Segregation.
● The design scales to future categories
with different operational constraints.
● Documentation clearly communicates
which operations are supported for each
category.
HINTS FOR IMPLEMENTING UC14:
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 6/24
Step 1 – Refactor IMesurable Interface
1. Create ArithmeticOperation Enum
Add a functional interface to indicate whether ameasurable unit supports arithmetic operations.
@FunctionalInterfacepublic interface SupportsArithmetic {    boolean isSupported();}
2. Add Lambda Expressions to supportarithmetic operations
Add default variable lamnda function to indicatethat all measurable units support arithmeticoperations by default -
SupportsArithmetic supportsArithmetic = () ->true;
3. Add Default Methods
● Add a default method to ensure allmeasurable units support arithmeticoperations.
default boolean supportsArithmetic() {return supportsArithmetic.isSupported();}
● Add a default method to validatearithmetic operation as in default voidvalidateOperationSupport(Stringoperation). The default implementationdoes nothing, allowing all units tosupport all operations by default.Subclasses like TemperatureUnit canoverride this method to throw anexception if a specific operation, likeaddition or subtraction, is not supported.
default voidvalidateOperationSupport(Stringoperation) { // Subclasses can override to validatespecific operations}
Code Snippet
forIMeasurable Interface
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 7/24
UC14 Code Snippet 1.1 IMeasurable Interface
UC14 Code Snippet 1.2 IMeasurable Interface
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 8/24
Step 2–No Update LengthUnit, WeightUnit,VolumeUnit
Step 3 –Create TemperatureUnit Enum
● TemperatureUnit Enum extends
IMeasurable interface and implements
the mandatory methods as well as the
optional default methods defined in the
IMeasurable interface
● Defines Celsius and Fahrenheit units
along with the flag indicating the
conversion. Here Celsius is considered
as the base unit
● The conversion logic uses Functional
Interface and Lambda Expression to be
applied when invoked
● Also define lambda expression to set the
support arithmetic to false
● Also override the default function for
support arithmetic and validate operation
methods
Code Snippet
forTemperatureUnit Enum Class
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3v… 9/24
UC14 Code Snippet 2.1 TemperatureUnit
enum Class
UC14 Code Snippet 2.2 TemperatureUnit
enum Class
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 10/24
UC14 Code Snippet 2.3 TemperatureUnit
enum Class
Step 4–Update Quantity
● Comparison Method — The comparison
method should work as is, using the
TemperatureUnit base conversion method
convertToBaseUnit()
● Conversion Method – This method
needs to be modified to check if it is
TemperatureUnit; if so, then call the
separate convertTo method for
conversion
● Arithmetic Method  – In
the performArithmetic method, call to
validate the arithmetic operation before
performing any arithmetic operation of
addition, subtraction, or division
Step 5 – QuantityMeasurementApp
As such no change to the demonstration
methods in the QuantityMeasurementApp, only
add in the main method to test Comparison,
Conversion, and any Arithmetic Operations to
be done on TemperatureUnit
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 11/24
Step 6 – Temperature Conversion Test Cases
Test all conversion pairs and edge cases with
epsilon tolerance for floating-point precision.
Example Output of running the
App
Temperature Equality Comparisons:
● Input: new Quantity<>(0.0,
CELSIUS).equals(new Quantity<>(32.0,
FAHRENHEIT)) →  Output: true
● Input: new Quantity<>(273.15,
KELVIN).equals(new Quantity<>(0.0,
CELSIUS)) →  Output: true
● Input: new Quantity<>(212.0,
FAHRENHEIT).equals(new Quantity<>
(100.0, CELSIUS)) →  Output: true
● Input: new Quantity<>(100.0,
CELSIUS).equals(new Quantity<>
(373.15, KELVIN)) →  Output: true
● Input: new Quantity<>(50.0,
CELSIUS).equals(new Quantity<>(122.0,
FAHRENHEIT)) →  Output: true (within
epsilon)
Temperature Conversions:
● Input: new Quantity<>(100.0,
CELSIUS).convertTo(FAHRENHEIT) →
Output: Quantity(212.0, FAHRENHEIT)
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 12/24
● Input: new Quantity<>(32.0,
FAHRENHEIT).convertTo(CELSIUS) →
Output: Quantity(0.0, CELSIUS)
● Input: new Quantity<>(273.15,
KELVIN).convertTo(CELSIUS) →  Output:
Quantity(0.0, CELSIUS)
● Input: new Quantity<>(0.0,
CELSIUS).convertTo(KELVIN) →  Output:
Quantity(273.15, KELVIN)
● Input: new Quantity<>(-40.0,
CELSIUS).convertTo(FAHRENHEIT) →
Output: Quantity(-40.0, FAHRENHEIT)
(equal point)
Unsupported Operations (Error Handling):
● Input: new Quantity<>(100.0,
CELSIUS).add(new Quantity<>(50.0,
CELSIUS)) →  Throws
UnsupportedOperationException:
"Temperature does not support
addition..."
● Input: new Quantity<>(100.0,
CELSIUS).subtract(new Quantity<>(50.0,
CELSIUS)) →  Throws
UnsupportedOperationException
● Input: new Quantity<>(100.0,
CELSIUS).divide(new Quantity<>(50.0,
CELSIUS)) →  Throws
UnsupportedOperationException
Cross-Category Prevention:
● Input: new Quantity<>(100.0,
CELSIUS).equals(new Quantity<>(100.0,
FEET)) →  Output: false (different
categories)
Temperature Comparisons with Other
Categories:
● Input: new Quantity<>(50.0,
CELSIUS).equals(new Quantity<>(50.0,
KILOGRAM)) →  Output: false
Concepts Learned byImplementing UC12:
1. Functional Interface
● A Functional Interface is simplyany interface that has exactly oneabstract method described withannotation @FunctionalInterface
● The DoubleBinaryOperator usedin ArithmaticOperation is afunctional interface. Whichessentially means it takes twodouble values (the base unitvalues of the quantities) andreturns a double result after
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 13/24
performing the specifiedoperation.
● The Lambda Syntex (a,b) -> a + bsees (a,b) as theDoubleBinaryOperator passed tothe constant object ADDconstructor.
● The compiler looks atDoubleBinaryOperator and sees ithas one method:applyAsDouble(double left,double right)
● It checks your lambda: (a, b)matches the two doublesrequired, and a + b matches thedouble return type.● The compiler "bridges" the two,effectively turning your lambdainto the implementation of thatinterface.
2. Lambda Expressions
● Lambda Expression is a conciseway to represent an "anonymousfunction"—a function that doesn'thave a name, doesn't belong to aspecific class on its own, and canbe passed around like a piece ofdata.● In Java, lambdas were introducedto make "FunctionalProgramming" possible, allowingyou to treat logic as an argumentfor a method.● The Anatomy of a Lambda: Alambda expression consists ofthree parts:○ Argument List: The inputs(e.g., (a, b)).○ The Arrow Token: The ->symbol, which separatesthe inputs from the logic.○ The Body: The actual codeto be executed (e.g., a +b).
3. Interface Segregation Principle (ISP)
● Refactored IMeasurable separatesmandatory conversion fromoptional operations.● Categories can implement onlywhat they need.● Violates ISP to force temperatureto implement unsupportedarithmetic.
4. Default Methods in Interfaces
● Provide default implementationsthat can be overridden selectively.
● Maintain backward compatibility(existing enums inherit defaults).
● Powerful for evolving interfaceswithout breaking clients.
5. Non-Linear Conversions
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 14/24
● Temperature conversions are non-linear (addition/subtractioninvolved).● Different from linear conversions(multiplication by factor).● Requires special handling inconversion logic.
6. Absolute vs. Relative Temperatures
● Absolute temperature: 100°C is aspecific point on the scale.● Relative temperature (difference):"100°C increase" is meaningful.● Arithmetic on absolutetemperatures is nonsensical(100°C + 50°C ≠  150°C).
7. Operation Validity Constraints
● Not all operations are valid for allmeasurement categories.
● Type system should communicateconstraints when possible.● Runtime validation provides safetywhen compile-time checking isinsufficient.
8. Capability-Based Design
● Query units about supportedoperations before attemptingthem.● Allows graceful degradation andclear error messages.● More user-friendly than silentfailures.
9. Method Overriding for BehavioralCustomization
● Each TemperatureUnit constantprovides specific conversionlogic.● Enum abstract methods enablebehavior variation per constant.● Cleaner than if-else chains inconversion methods.
10.Exception Semantics
● UnsupportedOperationExceptionclearly communicates operationnot available.
● Distinct fromIllegalArgumentException (invalidarguments).● Better than generic Exception orNullPointerException.
11.Conversion Formula Accuracy
● Temperature conversions must beprecise (F = C × 9/5 + 32).● Floating-point rounding impactsaccuracy.● Epsilon-based comparisonessential for validation.
12.Category-Specific Offset Handling
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 15/24
● Each temperature unit hasconceptual offset (though notused in conversion).● Stored as enum field for futureextensibility.● Shows enum ability to carrymetadata beyond constants.
13.Backward Compatibility ThroughDefaults
● Existing units (Length, Weight,Volume) require no changes.
● Default true values maintainexisting behavior.● Refactoring is non-breakingevolution.
14.Validation at Entry Points
● Check supportsOperation() beforeattempting operation.
● Fail fast with clear errormessages.● Prevents silent logic errors.
15.Polymorphic Error Handling
● Different units can provide unit-specific error messages.● TemperatureUnit.validateOperationSupport()explains why unsupported.● Enhances user experience vs.generic error.
16.Type Safety Through Generics
● Compile-time check preventsQuantity<TemperatureUnit> frombeing used asQuantity<LengthUnit>.● equals() runtime check addssecond layer.
● Layered safety prevents categoryconfusion.
17.Scaling to Future Categories
● New categories can overrideoperation support methodsselectively.● Design accommodates diverseoperational constraints.● Template for categories withunique properties.
Key Concepts Tested:
1. Celsius-to-Celsius Equality
● Two temperatures in Celsius withsame value are equal.● Baseline equality for temperaturemeasurements.
2. Fahrenheit-to-Fahrenheit Equality
● Two temperatures in Fahrenheitwith same value are equal.
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 16/24
● Within-unit equality forFahrenheit.
3. Kelvin-to-Kelvin Equality
● Two temperatures in Kelvin withsame value are equal.● Within-unit equality for Kelvin.
4. Cross-Unit Temperature Equality(Celsius to Fahrenheit)
● 0°C equals 32°F.● Accurate conversion betweenmetric and imperial scales.
5. Cross-Unit Temperature Equality(Celsius to Kelvin)
● 0°C equals 273.15 K.● Accurate conversion betweenCelsius and absolute scale.
6. Cross-Unit Temperature Equality(Fahrenheit to Kelvin)
● Complex multi-step conversion isaccurate.● Conversion through intermediateunits maintains precision.
7. Symmetric Equality
● If A equals B, then B equals A.● Bidirectional conversion accuracy.
8. Transitive Equality
● If A equals B and B equals C, thenA equals C.
● Conversion logic maintainsmathematical properties.
9. Temperature Conversion Accuracy
● Conversions producemathematically correct results.● Epsilon-based tolerance forfloating-point precision.
10.Celsius to Fahrenheit Conversion
● Formula accuracy: °F = (°C × 9/5)+ 32.● Tested with multiple values (0,100, -40, etc.).
11.Fahrenheit to Celsius Conversion
● Formula accuracy: °C = (°F - 32) ×5/9.
● Bidirectional equivalence.
12.Kelvin Conversions
● Kelvin as base unit for internalcalculations.● Conversions maintain absolutezero reference.
13.Edge Case: Absolute Zero
● -273.15°C = 0 K = -459.67°F.
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 17/24
● Extreme value handling.
14.Edge Case: Equal Point
● -40°C = -40°F (Celsius andFahrenheit intersection).
● Unique mathematical propertyvalidation.
15.Unsupported Addition Operation
● add() throwsUnsupportedOperationException.● Error message is clear andinformative.
16.Unsupported Subtraction Operation
● subtract() throwsUnsupportedOperationException.● Consistent error handling withaddition.
17.Unsupported Division Operation
● divide() throwsUnsupportedOperationException.
● Temperature-specific constraintenforcement.
18.Null Unit Handling
● new Quantity<>(100.0, null)throws IllegalArgumentException.● Validation works for temperatureas for other categories.
19.Same Reference Equality
● A temperature object equals itself.
● Reflexive property holds.
20.Type Safety: Temperature vs. Length
● Comparing temperature withlength returns false.
● Cross-category prevention works.
21.Type Safety: Temperature vs. Weight
● Comparing temperature withweight returns false.
● Category isolation maintained.
22.Type Safety: Temperature vs. Volume
● Comparing temperature withvolume returns false.● Comprehensive cross-categoryprevention.
23.Operation Support Methods
● TemperatureUnit.supportsAddition()returns false.● TemperatureUnit.supportsDivision()returns false.● Capability-based designvalidation.
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 18/24
24.Default Operation Support (Non-Temperature)
● LengthUnit.supportsAddition()returns true (inherited default).● WeightUnit.supportsDivision()returns true (inherited default).● Backward compatibilitymaintained.
25.IMeasurable Interface Evolution
● New default methods do notbreak existing implementations.● Interface segregation improvesdesign.● Non-breaking addition of optionalmethods.
26.Error Message Clarity
● Exception message explains whyoperation unsupported.● User-friendly vs. cryptic errors.
● Guides developers to validoperations.
27.Precision Across Unit Scales
● Conversions maintain accuracyacross vastly different scales.● Celsius (-273.15 to 100+) vs.Fahrenheit (-459.67 to 212+) vs.Kelvin (0 to 373+).
28.Rounding Consistency
● Conversion results rounded to twodecimal places.
● Consistent withaddition/subtraction in othercategories.
29.All Temperature CategoriesRepresented
● Three main temperature unitssupported.
● Scalable to other scales ifneeded.
30.Integration with Generic System
● Quantity<TemperatureUnit> worksseamlessly.● No modifications needed to coreQuantity<U> class structure.
● Enum-based approachaccommodates new categorynaturally.
Test Case Examples:
1. testTemperatureEquality_CelsiusToCelsius_SameValue()
● Verifies new Quantity<>(0.0,CELSIUS).equals(new Quantity<>(0.0, CELSIUS)) returns true.
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 19/24
2. testTemperatureEquality_FahrenheitToFahrenheit_SameValue()
● Verifies new Quantity<>(32.0,FAHRENHEIT).equals(newQuantity<>(32.0, FAHRENHEIT))returns true.
3. testTemperatureEquality_CelsiusToFahrenheit_0Celsius32Fahrenheit()
● Verifies new Quantity<>(0.0,CELSIUS).equals(new Quantity<>(32.0, FAHRENHEIT)) returnstrue.
4. testTemperatureEquality_CelsiusToFahrenheit_100Celsius212Fahrenheit()
● Verifies new Quantity<>(100.0,CELSIUS).equals(new Quantity<>(212.0, FAHRENHEIT)) returnstrue.
5. testTemperatureEquality_CelsiusToFahrenheit_Negative40Equal()
● Verifies new Quantity<>(-40.0,CELSIUS).equals(new Quantity<>(-40.0, FAHRENHEIT)) returnstrue.
6. testTemperatureEquality_SymmetricProperty()
● Verifies symmetric property: if Aequals B, then B equals A.
7. testTemperatureEquality_ReflexiveProperty()
● Verifies temperature equals itself.
8. testTemperatureConversion_CelsiusToFahrenheit_VariousValues()
● Test multiple values: 50°C →122°F, -20°C →  -4°F, etc.
9. testTemperatureConversion_FahrenheitToCelsius_VariousValues()
● Test reverse conversions with thesame values.
10.testTemperatureConversion_RoundTrip_PreservesValue()
● Verify convert(convert(value, A,B), B, A) ≈  value.
11.testTemperatureConversion_SameUnit()
● Verify converting to same unitreturns unchanged value.
12.testTemperatureConversion_ZeroValue()
● Verify conversion of zero works(0°C to °F = 32°F).
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 20/24
13.testTemperatureConversion_NegativeValues()
● Test negative temperatureconversions.
14.testTemperatureConversion_LargeValues()
● Test very high temperatures (e.g.,1000°C).
15.testTemperatureUnsupportedOperation_Add()
● Verifies new Quantity<>(100.0,CELSIUS).add(new Quantity<>(50.0, CELSIUS)) throwsUnsupportedOperationException.● Tests error message clarity.
16.testTemperatureUnsupportedOperation_Subtract()
● Verifies subtract() throwsUnsupportedOperationException.
17.testTemperatureUnsupportedOperation_Divide()
● Verifies divide() throwsUnsupportedOperationException.
18.testTemperatureUnsupportedOperation_ErrorMessage()
● Verifies error message explainswhy operation unsupported.
19.testTemperatureVsLengthIncompatibility()
● Verifies new Quantity<>(100.0,CELSIUS).equals(new Quantity<>(100.0, FEET)) returns false.
20.testTemperatureVsWeightIncompatibility()
● Verifies new Quantity<>(50.0,CELSIUS).equals(new Quantity<>(50.0, KILOGRAM)) returns false.
21.testTemperatureVsVolumeIncompatibility()
● Verifies new Quantity<>(25.0,CELSIUS).equals(new Quantity<>(25.0, LITRE)) returns false.
22.testOperationSupportMethods_TemperatureUnitAddition()
● VerifiesTemperatureUnit.CELSIUS.supportsAddition()returns false.
23.testOperationSupportMethods_TemperatureUnitDivision()
● VerifiesTemperatureUnit.FAHRENHEIT.supportsDivision()returns false.
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 21/24
24.testOperationSupportMethods_LengthUnitAddition()
● VerifiesLengthUnit.FEET.supportsAddition()returns true (inherited default).
25.testOperationSupportMethods_WeightUnitDivision()
● VerifiesWeightUnit.KILOGRAM.supportsDivision()returns true.
26.testIMeasurableInterface_Evolution_BackwardCompatible()
● Verify existing units work withoutmodification.● No breaking changes to interface.
27.testTemperatureUnit_NonLinearConversion()
● Verify that temperatureconversions use formulas, notsimple multiplication.● Test complex conversion logic.
28.testTemperatureUnit_AllConstants()
● Verify CELSIUS, andFAHRENHEIT are accessible.● Test enum structure.
29.testTemperatureUnit_NameMethod()
● Verify getUnitName() returnscorrect names.
30.testTemperatureUnit_ConversionFactor()
● Verify getConversionFactor()(implementation choice: always1.0 or throws exception).
31.testTemperatureNullUnitValidation()
● Verify new Quantity<>(100.0,null) throwsIllegalArgumentException.
32.testTemperatureNullOperandValidation_InComparison()
● Verify equals(null) returns false.
33.testTemperatureDifferentValuesInequality()
● Verify 50°C ≠  100°C.
34.testTemperatureBackwardCompatibility_UC1_Through_UC13()
● Run all existing test cases; verifytemperature additions don't breakother categories.
35.testTemperatureConversionPrecision_Epsilon()
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 22/24
● Verify epsilon-based tolerance inconversion equality.
36.testTemperatureConversionEdgeCase_VerySmallDifference()
● Test precision with very closetemperatures.
37.testTemperatureEnumImplementsIMeasurable()
● Verify TemperatureUnitimplements IMeasurable interfacecorrectly.
38.testTemperatureDefaultMethodInheritance()
● Verify non-temperature unitsinherit default true values foroperation support.
39.testTemperatureCrossUnitAdditionAttempt()
● Verify adding differenttemperature units throwsexception.
40.testTemperatureValidateOperationSupport_MethodBehavior()● Direct test:TemperatureUnit.CELSIUS.validateOperationSupport("addition")throws an exception.
41.testTemperatureIntegrationWithGenericQuantity()
● Verify Quantity<TemperatureUnit>works seamlessly with genericclass.
Code Snippet for Test Cases
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 23/24
UC14 Unit Test Results
Published using Google Docs Report abuse Learn more
UC14: Temperature Measurement with Selective Arithmetic Support and …Updated automatically every 5minutes
19/06/2026, 08:43 UC14: Temperature Measurement with Selective Arithmetic Support and IMeasurable Refactoring
https://docs.google.com/document/d/e/2PACX-1vTWBgb5ww8a6vN9ggF55MrZYWGsVGumJ9H28Rwqdv9EKAN_KVOYp0MfMuqHo404Bi12I3… 24/24


---
# UC15_ N-Tier Architecture Refactoring for Quantity Measurement Application(1)

UC15: N-Tier ArchitectureRefactoring for QuantityMeasurement Application
Description
UC15 refactors the monolithic Quantity MeasurementApplication into a professional N-Tier architecture byseparating concerns into distinct layers: ControllerLayer, Service Layer, and Entity/Model Layer. Thisarchitectural shift transforms the standaloneapplication from a single-responsibility class into ascalable, maintainable system that adheres to SOLIDprinciples and industry best practices.
The refactoring redistributes responsibilities asfollows:
● ApplicationLayer(QuantityMeasurementApp UC15): Servesas the entry point of the application, initiatingthe application and invoking the controller toperform operations on quantities.
● Controller Layer: Handles user interactionsand delegates business logic to the ServiceLayer.
● Service Layer: Contains the core businesslogic for quantity comparisons, conversions,and arithmetic operations.
● Entity/Model Layer: Defines the datastructures (DTOs and Entities) used across theapplication.
This architecture provides clear separation ofconcerns, improved testability, enhancedmaintainability, and a foundation for future scalability(e.g., adding REST endpoints, persistence layers, ordependency injection frameworks).
Lets dive into the details of each layer:
● Application Layer - The application layer isrepresented by the QuantityMeasurementAppUC15 class, which serves as the entry pointof the application. It initializes the necessarycomponents like the repository and service,and invokes the controller to perform variousoperations on quantities.
● Controller Layer - The controller layer isimplemented by theQuantityMeasurementController class, whichhandles user interactions and delegatesoperations to the service layer. It providesmethods for performing comparisons,
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 1/77
conversions, and arithmetic operations onquantities.
● Service Layer - The service layer isimplemented by theQuantityMeasurementServiceImpl class,which contains the core business logic forquantity comparisons, conversions, andarithmetic operations. It interacts with therepository to save measurement data andhandles exceptions that may occur duringoperations.
● Entity/Model Layer - The entity/model layerdefines the data structures used across theapplication, including QuantityDTO for datatransfer with external systems, QuantityModelused internally andQuantityMeasurementEntity for representingmeasurement records in the repository.
The Interface Segregation Principle is followed bydefining specific interfaces for the service andrepository layers, allowing for flexibility andseparation of concerns. The service interfaceIQuantityMeasurementService defines the contractfor performing operations on quantities, while therepository interface IQuantityMeasurementRepositorydefines the contract for data access operations. Thisdesign allows for easy substitution of differentimplementations of the service and repository layerswithout affecting the overall application structure.
The Interface Segregation Principle will be mainlyused in the Repository layer to define specificinterfaces for different types of repositories (e.g., in-memory cache, database, etc.). The currentimplementation uses a Cache RepositoryQuantityMeasurementCacheRepository thatimplements the IQuantityMeasurementRepositoryinterface, which provides a simple in-memorystorage mechanism for quantity measurement data.This design allows for easy substitution of differentrepository implementations in the future withoutaffecting the overall application structure. Theservice layer can interact with the repository throughthe defined interface, ensuring loose coupling andadherence to the Interface Segregation Principle.
Disadvantages of UC14Implementation (That UC15Addresses)
UC14 introduced TemperatureUnit and enhanced theIMeasurable interface, but the monolithic applicationstructure remains problematic:
1. Mixed Responsibilities in Single Class
● QuantityMeasurementApp handles UI,business logic, and datarepresentation simultaneously.● The main method containsdemonstration logic cluttered withservice calls.● Violates Single ResponsibilityPrinciple (SRP).● Difficult to isolate and test individualcomponents.
2. Business Logic Tightly Coupled toPresentation
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 2/77
● Demonstration methodsin QuantityMeasurementApphardcode business logic.● Changing UI format requiresmodifying business logic.● Cannot reuse business logic indifferent contexts (e.g., REST API, CLI,GUI).
3. Lack of Clear Data Flow
● No defined contract for input/outputdata structures.● Quantities passed directly betweenmethods without standardization.● Difficult to trace data transformations.
4. Limited Testability
● Testing business logic requiresmocking/capturing console output.● Integration tests entangled with UItests.● Unit tests for logic methodsimpossible without UI context.
5. Code Reusability Issues
● Demonstration and service methodsnot separately callable.● Adding new interfaces (REST, CLI,GUI) requires code duplication.● No service layer to share acrossmultiple clients.
6. Error Handling Scattered
● Exception handling mixed withbusiness logic and presentation.● No centralized error handling orvalidation.● Inconsistent error messaging acrossoperations.
7. Difficult to Extend
● Adding new measurement categoriesrequires modifying multiple methods.● No clear extension points for newoperations.● Framework integration (Spring, Guice)is impossible with a monolithicdesign.
8. Configuration and Initialization Mixed
● Quantity instantiation and serviceconfiguration are scattered.● No dependency management.● Difficult to mock or substituteimplementations.
9. No Separation Between Input and Output
● Methods return different types(Quantity, double, boolean).● No standardized response format.● Caller must handle multiple returntypes.
10.Violates Architectural Principles
● No clear layer definitions.● Tight coupling between allcomponents.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 3/77
● Difficult to achieve high cohesionwithin layers.
Preconditions
● All functionality from UC1–UC14 is fullyoperational (equality, conversion, arithmetic,temperature support).● The generic Quantity<U> class with allarithmetic operations is implemented.● IMeasurable interface with optional operationsupport is defined.● LengthUnit, WeightUnit, VolumeUnit, andTemperatureUnit enums are fullyimplemented.● The currentmonolithic QuantityMeasurementApp containsall the demonstration and business logic.● A clear understanding of N-Tier architectureand separation of concerns.● All existing test cases from UC1–UC14 willcontinue to pass with refactored code.● The refactoring will not change externalbehavior; it only reorganizes internalstructure.● Three new interfaces and implementationclasses will be created:QuantityMeasurementController,QuantityMeasurementService,and QuantityMeasurementRepository, alongwith POJO objects like QuantityDTO for DataTransfer, QuantityModel for internal use andQuantityMeasurementEntity to maintain theinputs and results in a repository● The Quantity<U> class is mainly refactored toQuantityMeasurementService Implementation
Main Flow
1. Step 1: Added helper methods inIMeasurable Interface
● Added helper methods to get themeasurement type and unit instancebased on unit name. This is essential forensuring that comparisons andconversions are only performed betweencompatible types and for convertingQuantityDTO to IMeasurable units.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 4/77
● LengthUnit, WeightUnit, VolumeUnit, andTemperatureUnit enums have beenupdated to implement these newmethods, ensuring that they can be easilyintegrated into the Quantity Measurementsystem for all operations. Please find thesample implementation
2. Step 2: Define POJO and DTO Objects
● All the classes defined below are PlainOld Java Classes (POJO) and DataTransfer Objects (DTO). POJO classes aresimple classes having only attributes andno behaviours. While the DTO are POJOclasses mainly used for transferring databetween different layers of an applicationboth for internal purpose as well as forexternal representations used for inputand output.
QuantityDTO Class (POJO):
● Data Transfer Object (POJO) for holdingquantity measurement input data - valueand corresponding unit and itsmeasurement.
● IMeasurableUnit is an interface definedwithin this DTO class to representmeasurable units for quantitymeasurements. This is different from theIMeasurable interface defined in theapplication, which is used for definingmeasurable units in the service layer.
● The IMeasurableUnit interface and thecorresponding enums LengthUnit,VolumeUnit, WeightUnit, andTemperatureUnit are defined within thisDTO class to provide a self-containedrepresentation of the quantity input,making it easier to create instances ofQuantityDTO as well as to map these unitsto the existing measurable units definedin the application for conversion.
● The supported measurement typesinclude: a. Length (e.g., feet, inches,yards, centimeters, meters) b. Weight(e.g., grams, kilograms, pounds, ounces)c. Volume (e.g., liters, milliliters, gallons)d. Temperature (e.g., Celsius, Fahrenheit,Kelvin)
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 5/77
Sample code is shown below. Please also referthe code snippet section to get the completeskeleton
QuantityModel Class (POJO):
● A generic POJO model class forrepresenting a quantity with its associatedunit of measurement of type derived fromIMeasurable well-defined unitsLengthUnit, VolumeUnit, WeightUnit, andTemperatureUnit
● The purpose of this DTO class is to beused within the service layer forperforming operations on quantities, suchas conversion, comparison, addition,subtraction, and division.
● Also used as a DTO for storing thequantities in the repository.
● This allows for a flexible representation ofquantities with different types ofmeasurable units. The generic type
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 6/77
parameter U allows for any unit thatimplements the IMeasurable interface,making it adaptable to variousmeasurement types such as length,weight, volume, and temperature.
Sample code is shown below. Please also refer thecode snippet section to get the complete skeleton
QuantityMeasurementEntity (POJO):
● The QuantityMeasurementEntity isdesigned to be a comprehensive dataholder for all aspects of a quantitymeasurement operation, including theoperands, the operation type, and theresult.
● It also includes fields for error handling,allowing it to capture and report anyissues that occur during operations.
● The QuantityMeasurementEntity classimplements the Serializable interface,allowing instances of this class to beeasily serialized and deserialized forstorage and retrieval from disk, which isessential for maintaining a persistenthistory of quantity measurements.
● Serialization is particularly important fortheQuantityMeasurementCacheRepository,which relies on serialization to save andload the history of operations acrossapplication restarts. The serialVersionUIDis defined to ensure compatibility duringthe serialization process, allowing forconsistent deserialization even if the classdefinition changes in the future, as longas the changes are compatible with theexisting serialized form.
● This entity class is designed to beImmutable, by having constructors forappropriate Operations - single or doubleoperand or for error in operations. ForImmutable Class the fields have to bedeclared as final. Here it is not becauseObject Serialization will not support finalvariables. The reason to initialize throughConstructors is for the purpose of threadsafety and consistency when used in amulti-threaded environment or whenshared across different components of theapplication.
● This class defines multiple constructors toaccommodate different scenarios ofquantity measurement operations,including comparison, conversion,addition, subtraction, and error handling.Each constructor is tailored to capture therelevant details for the specific type ofoperation being performed, ensuring that
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 7/77
all necessary information is stored in theentity for later retrieval and reporting.
● This design allows for easy tracking andreporting of quantity measurementoperations, making it a valuablecomponent for logging, debugging, anddisplaying results in a user interface. Itcan be used to store the details of eachoperation performed in the repository,enabling a complete history of quantitymeasurements to be maintained andaccessed as needed.
Sample code is shown below. Please also refer thecode snippet section to get the complete skeleton
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 8/77
3. Step 3: Create Repository Layer
IQuantityMeasurementRepository Interface :
● The IQuantityMeasurementRepositoryserves as the data access layer for theapplication, abstracting theimplementation details either in-memory caching or databaseinteractions, and providing a cleaninterface for managing quantitymeasurement data.
● This interface defines the contract fordata access operations related toQuantityMeasurement entities. Itprovides abstraction for thepersistence layer, enabling CRUDoperations and custom queries onquantity measurement data.
● Repository methods typically includestandard operations like save,findById, findAll, delete, etc. Here wedefine a method for saving aQuantityMeasurementEntity, which canbe implemented by a concrete class tohandle the actual databaseinteractions.
● The IQuantityMeasurementRepositoryInterface is designed in accordance tothe Interface Segregation Principlethus allowing different types ofrepositories (e.g., in-memory cache,database, etc.)
● The current implementation uses aCache Repository but this designallows for easy substitution of differentrepository implementations in thefuture without affecting the overallapplication structure. The service layercan interact with the repositorythrough the defined interface,ensuring loose coupling andadherence to the InterfaceSegregation Principle.Please refer the code snippet below to get theperspective of a complete skeleton
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 9/77
QuantityMeasurementCacheRepository SingletonClass :
● QuantityMeasurementCacheRepository isa repository class for managingpersistence operations related toQuantityMeasurementEntity.
● This class is a Singleton class andimplements theIQuantityMeasurementRepositoryinterface. It provides an in-memorycache for storingQuantityMeasurementEntity objects.
● This class also includes methods forsaving entities to disk and loadingthem back into memory, allowing forpersistence across application restartswithout the need for a full databaseimplementation. The saveToDiskmethod appends new entities to a file,while the loadFromDisk method readsexisting entities from the file when therepository is initialized.
● The repository usesa java.util.ArrayList to maintain an in-memory cache ofQuantityMeasurementEntity objects,which allows for quick access andretrieval of data without the overheadof database queries.
● Further, this list is initialized when therepository is created, and any entitiessaved to the repository are added tothis cache. The getAllMeasurementsmethod returns the contents of thiscache, providing a simple way toaccess all stored entities.
● This list is serialized to disk to ensurethat data is not lost when theapplication is restarted, and it isloaded back into memory when therepository is initialized.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 10/77
● Finally, to ensure that the file remainsvalid for reading multiple objectssequentially, ObjectOutputStream isenhanced with a customAppendableObjectOutputStream class.This is crucial for maintaining theintegrity of the data file when multipleentities are saved over time.
Sample code is shown below. Please also refer thecode snippet section to get the complete skeleton
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-x… 11/77
4. Step 4: Create Quantity MeasurementCustom Exception
● QuantityMeasurementException is acustom exception class used to handleerrors and exceptional conditionsrelated to quantity measurementoperations.
● This exception can be thrown wheninvalid measurements, unitconversions, or other quantity-relatedoperations fail during execution.
● Exception handling is crucial forproviding meaningful feedback tousers and for debugging issues in theapplication. By using a customexception, we can encapsulate allquantity measurement-related errors ina single class, making it easier tomanage and maintain the codebase
● This class extends RuntimeException,which means it is an uncheckedexception. This design choice allowsdevelopers to throw this exceptionwithout the need for explicit try-catchblocks, while still providing the optionto catch it if desired.
● The class includes constructors forcreating exceptions with custommessages and for chainingexceptions, allowing for more detailederror reporting and debugging.
Please refer to the code snippet below to get theperspective of a complete skeleton
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 12/77
5. Step 5: Create Service Layer
IQuantityMeasurementService Interface:
● IQuantityMeasurementService interfaceprovides contract methods forperforming quantity measurementoperations, including conversion,comparison, arithmetic operations,and division.
● This service interface definesoperations for working with quantitiesand their measurements. It acceptsinput in the form ofQuantityDTO Objects and returnsresults as QuantityDTO Objects
● Supported operations:○ Conversion - Convert quantitiesfrom one unit to another○ Comparison - Compare twoquantities○ Addition - Add two quantities○ Subtraction - Subtract onequantity from another○ Division - Divide quantities
Please also refer to the code snippet section toget the complete skeleton
QuantityMeasurementServiceImpl Class :
● QuantityMeasurementServiceImpl.java implementsIQuantityMeasurementService thatprovides functionality for quantitymeasurement operations.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 13/77
● The QuantityMeasurementServiceImpl classis designed to handle variousmeasurement types (length, weight,volume, temperature) and theirrespective units. It includes methodsfor converting between units,comparing quantities, and performingarithmetic operations.
● ThisQuantityMeasurementServiceImpl classis a crucial part of the QuantityMeasurement application, providingthe core logic for handling variousoperations on quantities and theirmeasurements. It ensures that theapplication can perform accurateconversions, comparisons, andarithmetic operations across differentunits of measurement, making it aversatile and robust solution forquantity measurement needs.
● The QuantityMeasurementServiceImpl classfollows the Single ResponsibilityPrinciple (SRP) as it is solelyresponsible for handling quantitymeasurement operations.
● It also follows the Open/ClosedPrinciple (OCP) as it is open forextension (new measurement typesand units can be added withoutmodifying existing code) but closedfor modification (existing code doesnot need to be changed toaccommodate new types or units).
● The conversion logic is used to firstconvert the quantities to a commonbase unit before performingcomparisons, conversions, orarithmetic operations, ensuringaccuracy and consistency acrossdifferent units of measurement.
● TheQuantityMeasurementServiceImpl classis very similar to the Quantity Class inthe original design from theperspective of the kind of services,like Comparison, Conversion, andArithmetic Operation, offered. Thebig difference isQuantityMeasurementServiceImplclass does not encapsulate anyattributes like the value and unit likeQuantity class does. This has beenrefactored to separate the concerns ofdata representation (QuantityDTO andQuantityModel) and business logic(QuantityMeasurementServiceImpl).
● This separation of concerns allows fora more modular and flexible design,making it easier to extend andmaintain the application in the future.This design allows for bettermaintainability, scalability, andadherence to SOLID principles.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 14/77
● The QuantityDTO andQuantityModel classes are used torepresent the data structure forquantities and their units, while theQuantityMeasurementServiceImplclass focuses on implementing thelogic for operations on thosequantities.
● The DTO and the Model classes serveas data carriers, one for transferringdata between layers (DTO) and theother for internal representation andprocessing (Model). This designallows for a clear separation ofconcerns, making the codebase moreorganized and easier to manage.
● TheQuantityMeasurementServiceImpl classalso interacts with theQuantityMeasurementRepository tosave the results of operations forfuture extensions, such as audit orhistory purposes. This design allowsfor better tracking and management ofquantity measurement operations.
● Dependency injection is used toprovide the repository instance to theservice, allowing for easy swapping ofrepository implementations (e.g.,cache or database) without modifyingthe service logic.
● In SummaryQuantityMeasurementServiceImplclass does the following○ Encapsulates all business logic.○ Orchestrates operations onQuantityDTO objects.○ Validates cross-categoryconstraints.○ Applies conversion andarithmetic rules.
Across each of the operations following broadsteps are followed:
● Accept QuantityDTO input.● Extract QuantityModel objects.● Performs validation onQuantityModel objects.● Perform business logic usingQuantityModel objects.● Handle exceptions and convertto'QuantityMeasurementException.● Create QuantityMeasurementEntity tostore in the RepositoryIQuantityMeasurementRepository● Return a standardizedQuantityDTO result.
Please also refer to the code snippet section to getthe complete skeleton
6. Step 6: Create Controller Layer
● QuantityMeasurementController servesas the entry point for theQuantityMeasurementApp.
● This controller is responsible forhandling requests related to quantity
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 15/77
measurements, including comparison,conversion, and arithmetic operationson various units of measurement.
● API methods in the controller aredesigned to be simple and focusedon handling requests and responses.The actual business logic forcomparison is delegated to theservice layer, ensuring a cleanseparation of concerns and promotingmaintainability.
● This Controller exposes API methodsthat accept input in the form ofQuantityDTO objects, whichencapsulate the value and unit of aquantity. This provides a standardizedway to represent quantities and theirassociated units for processing withinthe service layer.
● Dependency Injection is utilized toinject theQuantityMeasurementService dependencyinto this controller, promoting loosecoupling and improving testability.The controller delegates businesslogic to theQuantityMeasurementService implementation,which performs the actualmeasurement operations.
● The QuantityMeasurementApp classfrom the previous design has beenrefactored to expose similar APIdemonstration methods in thiscontroller class. Here are the methodnames changed fromdemonstrationXXX to performXXX tobetter reflect their purpose as RESTAPI methods that perform specificoperations on quantities.
● REST stands for RepresentationalState Transfer, which is anarchitectural style for designingnetworked applications. Futureextensions of this application couldinvolve exposing these methods asRESTful endpoints, allowing clients tointeract with the quantity measurementservice over HTTP. The performXXXmethods are designed to be easilyadaptable for such future extensions,where they can be mapped to specificHTTP verbs (e.g., GET forcomparison, POST for conversion andaddition) and endpoints (e.g.,/compare, /convert, /add) to providea RESTful API for quantitymeasurement operations.
● In SummaryQuantityMeasurementController classdoes the following○ Orchestrates interactionbetween user input and servicelayer.○ Validates input format andcorrectness. This will be donelater using Spring Validations
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 16/77
○ Calls appropriate servicemethods.○ Formats and presents results tothe user.
Please also refer to the code snippet section to getthe complete skeleton
7. Step 7: Refactor Application Entry Point
● QuantityMeasurementApp is the mainapplication class for the QuantityMeasurement system. This singletonclass serves as the entry point of theapplication and is responsible forinitiating the application and creatinginstances of the controller andrepository.
● The Quantity Measurement systemimplements Factory Design Pattern tocreate instances for mainly theController and Service layers. It alsoimplements Facade Design Pattern toprovide a simplified Controllerinterface for performing variousoperations on quantities, hiding thecomplexities of the underlyingimplementation.
● Listing the design patterns used in theapplication:
○ Factory Design Pattern: Usedto create instances ofcontrollers and services,allowing for flexibility andseparation of concerns.
○ Facade Design Pattern: TheQuantityMeasurementControllerserves as a facade, providing asimplified interface forperforming operations onquantities, while hiding thecomplexities of the underlyingservice implementations.
○ Singleton Design Pattern: TheQuantityMeasurementCacheRepositoryis implemented as a singletonto ensure that there is only oneinstance of the repositorythroughout the application,providing a centralized point ofaccess for quantitymeasurement data.
○ Interface SegregationPrinciple: The applicationdefines specific interfaces forthe service and repositorylayers, allowing for flexibilityand separation of concerns.The service interface(IQuantityMeasurementService)defines the contract forperforming operations onquantities, while the repositoryinterface(IQuantityMeasurementRepository)defines the contract for dataaccess operations. This designallows for easy substitution of
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 17/77
different implementations ofthe service and repositorylayers without affecting theoverall application structure.
○ Dependency Injection: Theservice layer is designed toreceive its dependencies (e.g.,repository) through constructorinjection, allowing for easyswapping of implementationsand promoting loose couplingbetween components.
● In Summary QuantityMeasurementAppclass does the following○ Initialize service and controller.○ Coordinate overall applicationflow.○ Delegate all logic to thecontroller.
8. Step 6: Implement Data Flow
Example Flow for Addition:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 18/77
Postconditions
● The application is organized into four distinctlayers with clear responsibilities.● The entity layer (QuantityEntity) providesstandardized data contracts.● Service layer (QuantityMeasurementService)encapsulates all business logic.● The Controller layer(QuantityMeasurementController) handlesorchestration and presentation.● Entry point (QuantityMeasurementApp) issimplified to initialization and delegation.● All UC1–UC14 test cases pass with refactoredcode (behavior unchanged).● Business logic is now testable without UIdependencies.● Services can be reused in multiple contexts(CLI, REST API, GUI).● Dependency injection ready (can integrateSpring, Guice, etc.).● Clear layer boundaries improvemaintainability and extensibility.● Error handling is centralized and consistent.● Data flow between layers is standardized andtraceable.
HINTS FOR IMPLEMENTING UC15(Code Snippet):
Step 1 – Create QuantityDTO POJO Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 19/77
UC15: Code Snippet 1.1 QuantityDTO.java Class
UC15: Code Snippet 1.2 QuantityDTO.java Class
Step 2 – Create QuantityModel POJO Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 20/77
UC15: Code Snippet 2.0 QuantityModel.javaClass
Step 3 – Create IQuantityMeasurementRepositoryInterface:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 21/77
UC15: Code Snippet 3.0IQuantityMeasurementRepository.java Interface
Step 4 –CreateQuantityMeasurementCacheRepository SingletonClass:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 22/77
UC15: Code Snippet 4.1QuantityMeasurementCacheRepository.java Class
UC15: Code Snippet 4.2QuantityMeasurementCacheRepository.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 23/77
UC15: Code Snippet 4.3QuantityMeasurementCacheRepository.java Class
Step 5 – Create QuantityMeasurementEntity POJOClass
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 24/77
UC15: Code Snippet 5.1QuantityMeasurementEntity.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 25/77
UC15: Code Snippet 5.2QuantityMeasurementEntity.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 26/77
UC15: Code Snippet 5.3QuantityMeasurementEntity.java Class
Step 6 – IQuantityMeasurementService Interface:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 27/77
UC15: Code Snippet 6.1IQuantityMeasurementService.java Interface
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 28/77
UC15: Code Snippet 6.2IQuantityMeasurementService.java Interface
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 29/77
UC15: Code Snippet 6.3IQuantityMeasurementService.java Interface
Step 7 – QuantityMeasurementServiceImpl Class :
UC15: Code Snippet 7.1QuantityMeasurementServiceImpl.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 30/77
UC15: Code Snippet 7.2QuantityMeasurementServiceImpl.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 31/77
UC15: Code Snippet 7.3QuantityMeasurementServiceImpl.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 32/77
UC15: Code Snippet 7.4QuantityMeasurementServiceImpl.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 33/77
UC15: Code Snippet 7.5QuantityMeasurementServiceImpl.java Class
Step 8 – QuantityMeasurementController
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 34/77
UC15: Code Snippet 8.1QuantityMeasurementController.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 35/77
UC15: Code Snippet 8.2QuantityMeasurementController.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 36/77
UC15: Code Snippet 8.3QuantityMeasurementController.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 37/77
UC15: Code Snippet 8.4QuantityMeasurementController.java Class
Step 9 – QuantityMeasurementApp class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 38/77
UC15: Code Snippet 9.1QuantityMeasurementApp.java Class
UC15: Code Snippet 9.2QuantityMeasurementApp.java Class
Detailed Concepts for UC15: N-TierArchitecture Implementation:
N-Tier Architecture OverviewN-Tier (or Multi-Tier) architecture is a softwaredesign pattern that organizes an application intodistinct layers, each with specific responsibilities.This separation of concerns creates a modular,maintainable, and scalable system. In UC15, weimplement a 4-Tier architecture:
1. Application Layer (Entry Point)
Purpose: Serves as the bootstrap point forthe entire application.Responsibilities:● Initialize the application● Instantiate service and controllerdependencies● Coordinate the startup sequence● Entry point via main() method
Please refer the code snippet forQuantityMeasurementApp:
Benefits:
● Clean entry point with minimal logic● Easy to swap implementations viadependency injection● Centralized initialization supportsframework integration
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 39/77
● Facilitates testing by enabling mockinjection
2. Controller Layer (Orchestration &Presentation)
Purpose: Acts as the bridge between userinteraction and business logic.
Responsibilities:● Accept user input (eventually fromHTTP requests in REST context)● Validate input format and structure● Route requests to appropriate servicemethods● Format and present results to users● Handle presentation concerns
Key Principles:● Thin controller philosophy: minimalbusiness logic● Delegates all computation to servicelayer● Acts as a facade for service layercomplexity
Please refer the code snippetfor QuantityMeasurementController:
REST API Readiness: The controller methodsare designed to easily map to RESTendpoints:
● POST /api/quantity/compare● POST /api/quantity/convert● POST /api/quantity/add● POST /api/quantity/subtract● POST /api/quantity/divide
3. Service Layer (Business Logic)
Purpose: Encapsulates all business rules anddomain logic.
Responsibilities:● Implement quantity comparison logic● Implement unit conversion algorithms● Implement arithmetic operations● Validate business rules (cross-categoryprevention, etc.)● Coordinate with repository forpersistence● Handle all domain-specific exceptions
Key Principles:
● Single Responsibility: focused onquantity measurement operations● Open/Closed: extensible for newunits without modification● No presentation concerns (noSystem.out.println)● No HTTP awareness (testableindependently)
Please refer the code snippet forQuantityMeasurementServiceImpl:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 40/77
4. Entity/Model Layer (Data Representation)
Purpose: Defines data structures for layercommunication and persistence.
Responsibilities:
● Represent quantity measurements withvalue and unit● Transfer data between layers (DTOs)● Store operation history (Entities)● Provide standard contracts forcommunication
Three Key Data Classes:a. QuantityDTO - Data Transfer ObjectWhen to use DTOs:● Accept user input from controller● Return results from service tocontroller● Define API contracts for future RESTservices● Decouple internal service modelsfrom external representationb.  QuantityModel - Internal Service ModelPurpose:● Used internally within service layer● Generic type safety with boundedtype parameter● Ensures type consistency for quantityoperations
c. QuantityMeasurementEntity - PersistenceModel
Interface Segregation Principle (ISP)
Definition: Clients should not be forced to dependon interfaces they do not use.Philosophy: It is better to have many specificinterfaces than one general-purpose interface.
Application in UC15:
1. Service Interface Segregation
2. Repository Interface Segregation
Benefits:● Controller only depends onIQuantityMeasurementService● Easy to add new services without affectingexisting clients● Future repository implementations canimplement specific interfaces● Testing: Mock only the interfaces being used
POJO (Plain Old Java Object) Class
Definition: A class that does NOT extend any class,does NOT implement any interface, and has NOframework annotations. Only has attributes andpractically no methods apart from constructors,getters and settersWhy Use POJOs:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 41/77
● Framework Agnostic: Works with anyframework or no framework● Serializable: Can be easily converted toJSON, XML, database records● Reusable: Can be used in many contextswithout modification● Testable: Simple objects are easy to test● Portable: Can be transferred between layersand systemsPOJO vs. Rich Domain Objects:
Data Transfer Objects (DTOs)Definition: Objects specifically designed to transferdata between layers or systems, carrying only thedata needed for a specific operation.Purpose of DTOs in UC15:
Benefits of DTOs:
Separation of Concerns:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 42/77
Security:
API Versioning:
Bandwidth Optimization:
SerializationDefinition: The process of converting an object intoa byte stream that can be stored or transmitted, andlater deserialized back into the original object.
Java Serialization Example:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 43/77
Serialization Considerations:
Singleton Design Pattern
Definition: A creational design pattern that restrictsa class to have a single instance and provides aglobal point of access to that instance.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 44/77
Application in UC15: Repository Layer
Why Singleton for Repository:
● Centralized Data Storage: One cache forentire application● Consistency: All parts of app access samedata● Resource Efficiency: No duplicate instances● Predictable Behavior: Known global state
Factory Design Pattern
Definition: A creational design pattern that providesan interface for creating objects without specifyingtheir exact classes.
Application in UC15: Application Layer
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 45/77
Factory for Different Implementations:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 46/77
Benefits:
● Flexibility: Easy to switch betweenimplementations● Decoupling: Clients don't know aboutconcrete classes● Extensibility: Add new implementationswithout changing client code● Testability: Can create mock implementationsfor testing
Dependency Injection (DI)
Definition: A design pattern where an objectreceives its dependencies from external sourcesrather than creating them itself.
Types of Dependency Injection:
1. Constructor Injection (Preferred)
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 47/77
Advantages:● Dependencies required at construction time● Immutable references● Clearly shows what's needed● Enables immutability
2. Setter Injection
Disadvantages:
● Dependencies optional (might be null)● Can create invalid objects● Less clear requirements
3. Interface Injection
Why Use Dependency Injection in UC15:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 48/77
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 49/77
Dependency Injection Frameworks:
Immutable Class Benefits
Definition: An immutable class is one whoseinstances cannot be modified after creation. Allfields are final and set only during construction.
Creating Immutable Objects in UC15:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 50/77
Benefits of Immutability:
1. Thread Safety
2. Predictable Behavior
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 51/77
3. Safe Collection Sharing
4. Caching and Hashing
5. Simple Equality
Java Custom Exceptions
Definition: User-defined exception classes thatextend `Exception` or `RuntimeException` to handleapplication-specific error conditions.
1. Custom Exception for UC15:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 52/77
2. Checked vs. Unchecked Exceptions:
3. When to Use Which:
4. Exception Hierarchy:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 53/77
Exception Handling
Definition: Process of handling runtime errorsgracefully to prevent application crashes andprovide meaningful feedback.
Exception Handling in UC15 Layers:
1. Service Layer: Catch and Convert
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 54/77
2. Controller Layer: Handle and Display
3. Try-Catch-Finally Pattern:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 55/77
4. Try-With-Resources (Modern Approach):
5. Custom Exception Handling:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 56/77
REST (Representational State Transfer)
Definition: An architectural style for buildingdistributed systems using HTTP protocol,emphasizing stateless client-server communication.
REST Principles:
● Client-Server Architecture● Statelessness: Server doesn't store clientcontext● Uniform Interface: Consistent way tocommunicate● Resource-Based: Operations on resources,not actions● Representational: Resources represented inmultiple formats (JSON, XML)
How UC15 Prepares for REST:
1. Resource-Oriented Design
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 57/77
2. HTTP Methods Mapping
3. Stateless Communication
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 58/77
4. Standardized Response Format
5. REST with Spring Boot (Future Extension)
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 59/77
REST API Example Flow:
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 60/77
Benefits of REST Architecture for UC15:
● Scalability: Stateless design enables loadbalancing● Flexibility: DTOs standard for HTTPtransmission● Reusability: Service layer usable by multipleclients● Testability: Can test endpoints with HTTPclients● Integration: Easy integration with othersystems● Mobile-Friendly: JSON response suitable formobile apps
Summary: How These Concepts Work Togetherin UC15
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 61/77
Summary of the Concepts Learnedby Implementing UC15:
1. Separation of Concerns
● Each layer has a single, well-definedresponsibility.● Entity: data representation.● Service: business logic.● Controller: orchestration andpresentation.● Improves maintainability andtestability.
2. N-Tier Architecture Principles
● Layered architecture provides clearboundaries.● Enables independent development,testing, and deployment of layers.● Facilitates scalability and extensibility.
3. Data Transfer Objects (DTOs)
● QuantityEntity serves as astandardized contract between layers.● Decouples layers from internal datarepresentation.● Simplifies API design and clientintegration.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 62/77
4. Service-Oriented Design
● Service layer encapsulates reusablebusiness logic.● Can be invoked from multiple contexts(CLI, REST, GUI).● Enables code reuse across differentinterfaces.
5. Dependency Injection Pattern
● Controller depends on Serviceinterface, not implementation.● Facilitates testing through mockservice injection.● Prepares codebase for frameworkintegration (Spring, Guice).
6. Error Handling as Data
● Errors represented as QuantityEntitywith error flag set.● Avoids exception-based control flowacross layers.● Enables consistent error handling andlogging.
7. Immutability in Data Objects
● QuantityEntity is immutable aftercreation.● Prevents unintended modificationsduring layer transitions.● Thread-safe data sharing.
8. Single Responsibility Principle (SRP)
● Controller: input validation androuting.● Service: business logic orchestration.● Entity: data representation.● Each class has one reason to change.
9. Open-Closed Principle (OCP)
● New measurement categories addedwithout modifying service logic.● New operations added by extendingcontroller without changing existingcode.● Extension available through newmethods, not modification.
10.Liskov Substitution Principle (LSP)
● Different unit implementations(LengthUnit, TemperatureUnit)substitutable.● Service methods work with anyIMeasurable implementation.● No special handling needed fordifferent categories.
11.Interface Segregation Principle (ISP)
● IMeasurable interface defines onlynecessary methods.● QuantityEntity provides focusedcontract for layer communication.● Clients depend only on interfaces theyuse.
12.Dependency Inversion Principle (DIP)
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 63/77
● High-level modules (Controller)depend on abstractions (Serviceinterface).● Low-level modules (Quantity) dependon abstractions (IMeasurable).● Reduces coupling and improvesflexibility.
13.Testability Improvements
● Service layer can be unit testedwithout UI.● Controller can be tested with mockservice.● Business logic isolated frompresentation concerns.
14.Scalability for New Interfaces
● Service layer reusable in REST API,CLI, GUI.● Same business logic applicable tomultiple clients.● Reduces redundancy andmaintenance burden.
15.Configuration and Initialization
● Centralized layer instantiation in mainmethod.● Enables easy modification ofdependencies.● Prepares for configurationmanagement frameworks.
Example Output of running the App
Example 1: Length Equality Demonstration
Example 2: Temperature Addition Attempt
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 64/77
Continued..
Example 3: Cross-Category Operation Prevention
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 65/77
Key Concepts Tested:
1. Entity Layer Functionality
● QuantityEntity correctly stores inputand result data.● Supports both single and binaryoperations.● Error representation works correctly.● toString() formatting is clear andconsistent.
2. Service Layer Isolation
● Service methods accept onlyQuantityEntity input.● Return standardized QuantityEntityoutput.● No direct console I/O in service layer.● Error handling is consistent acrossoperations.
3. Controller Layer Orchestration
● Controller correctly routes to servicemethods.● Input validation occurs before servicecall.● Output formatting is consistent.● Error and success paths handledcorrectly.
4. Layer Communication
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 66/77
● Data flows correctly from Controller →Service.● Results flow correctly from Service →Controller.● No coupling between UI and businesslogic.
5. Error Propagation
● Service errors don't crash application.● Errors propagated as QuantityEntitywith error flag.● Controller displays errorsappropriately.
6. Business Logic Preservation
● UC1–UC14 functionality unchanged.● All operations produce identicalresults.● Behavior is identical to monolithicversion.
7. Reusability
● Service methods callable frommultiple contexts.● Entity structure supports variousclients.● No hardcoded dependencies onspecific interfaces.
8. Testability
● Service can be unit testedindependently.● Controller can be tested with mockservice.● Entity is simple POJO, easily testable.
9. Extensibility
● New operations added withoutmodifying existing layers.● New measurement categoriesintegrated seamlessly.● Layer responsibilities remain clear.
10.Data Standardization
● All layer interactions via standardizedQuantityEntity.● Reduces coupling and improvesmaintainability.
Test Case Examples:
1. testQuantityEntity_SingleOperandConstruction()
● Verifies QuantityEntity correctly storessingle-operand conversion data.● Tests: Constructor and getters forconversion scenario.
2. testQuantityEntity_BinaryOperandConstruction()
● Verifies QuantityEntity correctly storesbinary operation data.● Tests: Constructor and getters foraddition scenario.
3. testQuantityEntity_ErrorConstruction()
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 67/77
● Verifies QuantityEntity correctly storeserror data.● Tests: Error constructor and hasError()method.
4. testQuantityEntity_ToString_Success()
● Verifies toString() formats successfulresults clearly.● Tests: String representation forreading.
5. testQuantityEntity_ToString_Error()
● Verifies toString() formats errorsclearly.● Tests: Error message visibility.
6. testService_CompareEquality_SameUnit_Success()
● Verifies service correctly comparesquantities in same unit.● Tests: Service delegates toQuantity.equals().
7. testService_CompareEquality_DifferentUnit_Success()
● Verifies service correctly comparesquantities in different units.● Tests: Cross-unit comparison throughservice.
8. testService_CompareEquality_CrossCategory_Error()
● Verifies service rejects cross-categorycomparison.● Tests: Category compatibility check.
9. testService_Convert_Success()
● Verifies service correctly convertsbetween units.● Tests: Service delegates toQuantity.convertTo().
10.testService_Add_Success()
● Verifies service correctly performsaddition.● Tests: Service delegates toQuantity.add().
11.testService_Add_UnsupportedOperation_Error()
● Verifies service handles unsupportedoperations (temperature).● Tests: Exception conversion to errorentity.
12.testService_Subtract_Success()
● Verifies service correctly performssubtraction.● Tests: Service delegates toQuantity.subtract().
13.testService_Divide_Success()
● Verifies service correctly performsdivision.● Tests: Service returns dimensionlessscalar.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 68/77
14.testService_Divide_ByZero_Error()
● Verifies service handles division byzero.● Tests: Exception handling.
15.testController_DemonstrateEquality_Success()
● Verifies controller correctlydemonstrates equality.● Tests: Controller →  Serviceintegration.
16.testController_DemonstrateConversion_Success()
● Verifies controller correctlydemonstrates conversion.● Tests: Controller method routing.
17.testController_DemonstrateAddition_Success()
● Verifies controller correctlydemonstrates addition.● Tests: Controller handles successfuloperations.
18.testController_DemonstrateAddition_Error()
● Verifies controller correctly displayserrors.● Tests: Controller error handling.
19.testController_DisplayResult_Success()
● Verifies controller formats successresults correctly.● Tests: Output formatting.
20.testController_DisplayResult_Error()
● Verifies controller displays errormessages.● Tests: Error output format.
21.testLayerSeparation_ServiceIndependence()
● Verifies service can be tested withoutcontroller.● Tests: Layer isolation enables unittesting.
22.testLayerSeparation_ControllerIndependence()
● Verifies controller can work with mockservice.● Tests: Dependency injection pattern.
23.testDataFlow_ControllerToService()
● Verifies data correctly flows fromcontroller to service.● Tests: QuantityEntity as data contract.
24.testDataFlow_ServiceToController()
● Verifies results correctly flow fromservice to controller.● Tests: Standardized output format.
25.testBackwardCompatibility_AllUC1_UC14_Tests()
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 69/77
● Runs all test cases from UC1–UC14.● Tests: Behavior unchanged, onlystructure refactored.
26.testService_AllMeasurementCategories()
● Verifies service works with length,weight, volume, temperature.● Tests: Category scalability.
27.testController_AllOperations()
● Verifies controller can demonstrate alloperations.● Tests: Operation coverage.
28.testService_ValidationConsistency()
● Verifies validation errors are identicalacross operations.● Tests: Centralized validation in service.
29.testEntity_Immutability()
● Verifies QuantityEntity objects cannotbe modified after creation.● Tests: Immutability principle.
30.testService_ExceptionHandling_AllOperations()
● Verifies all operations convertexceptions to error entities.● Tests: Consistent error propagation.
31.testController_ConsoleOutput_Format()
● Verifies console output is clear andreadable.● Tests: User-facing formatting.
32.testIntegration_EndToEnd_LengthAddition()
● Full integration test: User input →Output.● Tests: Complete layer cooperation.
33.testIntegration_EndToEnd_TemperatureUnsupported()
● Full integration test: Error handlingacross layers.● Tests: Error handling integration.
34.testService_NullEntity_Rejection()
● Verifies service rejects null entities.● Tests: Input validation.
35.testController_NullService_Prevention()
● Verifies controller requires non-nullservice.● Tests: Dependency validation.
36.testService_AllUnitImplementations()
● Verifies service works with anyIMeasurable implementation.● Tests: Polymorphic behavior.
37.testEntity_OperationType_Tracking()
● Verifies operation type correctlyrecorded in entity.● Tests: Operation categorization.
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 70/77
38.testLayerDecoupling_ServiceChange()
● Verifies changing serviceimplementation doesn't affectcontroller.● Tests: Loose coupling enablesflexibility.
39.testLayerDecoupling_EntityChange()
● Verifies adding Entity fields doesn'tbreak layers.● Tests: Entity as stable contract.
40.testScalability_NewOperation_Addition()
● Verifies adding new operation doesn'trequire layer modifications.● Tests: Extensibility within layer design.
Code Snippet for Test Cases
UC15: Test Code Snippet 10.1QuantityMeasurementAppTest.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 71/77
UC15: Test Code Snippet 10.2QuantityMeasurementAppTest.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 72/77
UC15: Test Code Snippet 10.3QuantityMeasurementAppTest.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 73/77
UC15: Test Code Snippet 10.4QuantityMeasurementAppTest.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 74/77
UC15: Test Code Snippet 10.5QuantityMeasurementAppTest.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 75/77
UC15: Test Code Snippet 10.6QuantityMeasurementAppTest.java Class
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 76/77
UC15: Test Case Results
Published using Google Docs Report abuse Learn more
UC15: N-Tier Architecture Refactoring for Quantity Measurement Application Updated automatically every 5 minutes
19/06/2026, 08:43 UC15: N-Tier Architecture Refactoring for Quantity Measurement Application
https://docs.google.com/document/d/e/2PACX-1vQJCnQ37DkHC9baJlNV-2jGKPOQBxkJMantCo8DRD1MnkyJQrT0vVLZNX5VpX4s6iqlv86U-… 77/77


---
# UC16_ Database Integration with JDBC for Quantity Measurement Persistence(1)

UC16: Database Integrationwith JDBC for QuantityMeasurement Persistence
Description
UC16 extends the Quantity MeasurementApplication by introducing persistent databasestorage through JDBC (Java DatabaseConnectivity). Building upon the N-Tierarchitecture established in UC15, this use caseimplements aQuantityMeasurementDatabaseRepository classthat replaces the in-memoryQuantityMeasurementCacheRepository for long-term data persistence. The application nowsupports storing and retrieving quantitymeasurement operation history from a relationaldatabase, enabling audit trails, reporting, andhistorical analysis.
This use case also introduces professional projectstructure with Maven as the build tool, properpackage organization for controllers, services,repositories, and entities, comprehensive testcoverage, and automated database schemacreation. The refactoring maintains full backwardcompatibility while providing the option to switchbetween in-memory cache and database storagethrough dependency injection and factorypatterns.
UC16 demonstrates enterprise-level developmentpractices including:
● Professional folder structure followingMaven conventions● Package organization by layer (controller,service, repository, entity, exception)● Maven POM configuration fordependencies and plugins● JDBC-based database operations withconnection pooling● Database schema management andinitialization● Parameterized SQL queries for security(SQL injection prevention)● Transaction management for dataconsistency● Unit and integration testing with databasefixtures● Separation of test and productiondatabases
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 1/48
Disadvantages of UC15Implementation (That UC16Addresses)
UC15 provided clean N-Tier architecture butstored data only in memory and serialized to disk:
1. Limited Data Persistence
● In-memory cache lost on applicationcrash (before serialization).● Serialization to disk is inefficientand not scalable.● Cannot handle multiple applicationinstances accessing shared data.● No transaction support forconcurrent operations.
2. No Concurrent Access Management
● In-memory cache not designed formultiple JVM instances.● File-based serialization suffers fromrace conditions.● No locking mechanism forconcurrent updates.● Cannot serve as shared data sourcefor distributed systems.
3. Lack of Query Capabilities
● Can only load the entire dataset intomemory.● No ability to query by specificcriteria.● Cannot filter or aggregate datawithout loading all records.● Memory usage scales linearly withdata volume.
4. No Data Validation at Storage Layer
● No schema enforcement (all entitiessaved regardless of validity).● No foreign key constraints orreferential integrity.● Cannot prevent invalid data fromentering storage.
5. Poor Scalability
● In-memory storage limited byavailable heap memory.● Serialization to file I/O is slow andblocks operations.● Cannot distribute data acrossservers.● No built-in clustering or replication.
6. Difficulty in Data Analysis and Reporting
● Historical data not easily accessiblefor analysis.● No SQL support for complexqueries.● Cannot perform aggregations(count, sum, average) efficiently.● Analytics requires loading entiredataset.
7. Debugging and Troubleshooting Issues
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 2/48
● Hard to inspect what data wasstored after crashes.● Serialized files not human-readable.● No audit trail or change history.● Difficult to understand data state atkey points.
8. No Integration with Existing EnterpriseTools
● Cannot integrate with BI tools,reporting engines.● No compatibility with datawarehouses.● Cannot use standard databaseadmin tools.● Difficult to integrate with monitoringsystems.
9. Testing Difficulties
● In-memory repository not suitablefor testing concurrent scenarios.● Hard to create reproducible testdata.● No easy way to reset the databasebetween tests.● Integration testing limited.
10.No Schema Versioning or Migration
● Adding new fields requiresrefactoring code.● No way to version data structurechanges.● Cannot gradually migrate from oldto new format.● Risky updates to serialized dataformat.
Preconditions
● All functionality from UC1–UC15 is fullyoperational and tested.● N-Tier architecture with clear layerseparation is established.● IQuantityMeasurementRepository interfaceand QuantityMeasurementCacheRepositoryimplementation exist.● QuantityMeasurementEntity POJO correctlyrepresents measurement operation data.● Maven is installed and properly configuredon the development machine.● A relational database (MySQL, PostgreSQL,H2) is available for development.● Understanding of JDBC concepts and SQLis present.● JDK 8 or higher is available.● Project structure will follow Maven standarddirectory layout.● All UC1–UC15 test cases will pass with anew database repository.
Main Flow
Step 1: Set Up Project Structure
Maven Standard Directory Layout:
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 3/48
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 4/48
If you are not following the requisite folderstructure defined above please do the following.Firstly Open the Quantity Measurement App andfollow the following steps
Step 1A: Create the Folder Structure
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 5/48
Step 1B: Reorganize the Files in theappropriate Folder Structure: Perform thefollowing to either copy or move the files to therespective folders.
Note: if yourpackage com.apps.quantitymeasurement, youcan refactor to com.app.quantitymeasurement.Post that execute the command mvcom/app/quantitymeasurement/*.javasrc/main/java/com/app/quantitymeasurement/ thendo the following. Here you can copy or move thefile - recommendation to move the file:
1. Copy QuantityMeasurementApp.java to`src/main/java/com/app/quantitymeasurement/` Folder
Refactor:a. Change the package name for`QuantityMeasurementApp.java` and addnecessary imports as shown below.
b. Note that the App Constructor will beupdated to initialize the database repositoryinstead of the cache repository.
c. Note the addition of Logger for betterlogging practices. Instead of usingSystem.out.println for logging, we will useJava's built-in logging framework to providemore structured and configurable logging.
d. Ensure that the main method uses thelogger instead of System.out.println for output
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 6/48
2. Copy`QuantityMeasurementController.java` to`src/main/java/com/app/quantitymeasurement/controller/` asshown in the command below
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 7/48
Refactor:a. Change the package name for`QuantityMeasurementController.java` and addnecessary imports as shown below
b. Note the addition of Logger for betterlogging practices. Instead of usingSystem.out.println for logging, we will useJava's built-in logging framework to providemore structured and configurable logging.
c. Ensure that the main method uses the loggerinstead of System.out.println for output
3. Copy ServicesFiles (`IQuantityMeasurementService.java`and`QuantityMeasurementServiceImpl.java`)to`src/main/java/com/app/quantitymeasurement/services/` asshown in the command below
Refactor:a. Change the package name for
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 8/48
`IQuantityMeasurementService.java` and`QuantityMeasurementServiceImpl.java` andadd necessary imports as shown below
b. Note the addition of Logger for betterlogging practices. Instead of usingSystem.out.println for logging, we will useJava's built-in logging framework to providemore structured and configurable logging.
c. Ensure that the main method uses the loggerinstead of System.out.println for output
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wjeX… 9/48
4. Copy Repository Files to`src/main/java/com/app/quantitymeasurement/repository/`
Refactor:a. Change the package name for`IQuantityMeasurementRepository.java` and`QuantityMeasurementCacheRepository.java`and add necessary imports as shown below
b. Note the addition of Logger for betterlogging practices. Instead of usingSystem.out.println for logging, we will useJava's built-in logging framework to providemore structured and configurable logging.
c. Ensure that the main method uses the loggerinstead of System.out.println for output
5. Copy Quantity Model, DTO and EntityFiles to`src/main/java/com/app/quantitymeasurement/entity/` Folder
Refactor:a. Change the package namefor `QuantityDTO.java`, `QuantityModel.java` and`QuantityMeasurementEntity.java` and addnecessary imports as shown below:
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 10/48
6. Copy Exceptionsfiles `src/main/java/com/app/quantitymeasurement/exception/`Folder
Refactor:a. Change the package namefor `QuantityMeasurementException.java` andadd necessary imports as shown below:
7. Copy Unit IMeasurable Files to`src/main/java/com/app/quantitymeasurement/unit/` Folder
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 11/48
Refactor:a. Change the package name for`IMeasurable.java`, `LengthUnit.java`,`WeightUnit.java`,`VolumeUnit.java`  and`TemperatureUnit.java` and add necessaryimports as shown below:
Step 1C: Refactor the Package structure andadd the necessary importsPlease refer Step 1B and each of the points wherecode refactoring is needed at the following levels:
1. Package name is changed with groupid `com.app.quantitymeasurement` plusbased on the layer like the controller,service, repository, etc being added to thegroup id.
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 12/48
2. Because package name is changed importsbecomes a necessity to reference therelevant classes from the QuantityMeasurement packages
3. In `QuantityDTO.java` class the enumsLengthUnit, VolumeUnit, WeightUnit, andTemperatureUnit had to be made public sothat they have visibility outside the package
Step 1D: Add Logger for better loggingpractices
1. We have added Logger to the mainApplication class, Controller, Service andRepository classes. This will help us to logimportant information and errors in astructured way. Instead of usingSystem.out.println for logging, we will useJava's built-in logging framework to providemore structured and configurable logging.
2. We have added logging statements in theconstructors and main method to indicatethe initialization process and any importantevents. This will help us to trace the flow ofthe application and identify any issues thatmay arise during execution.
Step 2: Create Maven POM Configuration
Step 2A: Note
1. Please note we are using H2 Database and hence MySql and Postgress Propertiesand Dependencies are commented
2. Also Note the properties element definesthe versions being used. Please ensure youare using atleast java version 17 or aboveand maven version 3.6 or above. You cantest using following commands
3. If different please Install Required VSCodeExtensions:
○ Extension Pack for Java (byMicrosoft)○ Maven for Java (by Microsoft)
4. Other Dependencies are added, will beused in future. They are:
○ Mockito for Mocking of each layerslike Controller, Services,Repositories, etc for effective testing
○ SLF4J for Logging and LogbackClassic for the implementation ofSLF4J. This will help us to have
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 13/48
better logging practices in ourapplication. The SLF4J API providesa simple facade for various loggingframeworks, allowing us to use aconsistent logging API whilechoosing the underlying loggingimplementation (like Logback) thatbest suits our needs. Here we areusing Logback Classic as theimplementation of SLF4J, whichprovides powerful and flexiblelogging capabilities.
○ JUnit for Testing the application. Wewill be using JUnit 4.13.2 for writingour test cases. JUnit is a widely usedtesting framework for Javaapplications that providesannotations and assertions tofacilitate unit testing. It allows us towrite test cases to verify thecorrectness of our code and ensurethat it behaves as expected undervarious conditions.
○ H2 Database for testing purposes.H2 is an in-memory database that islightweight and easy to set up,making it ideal for testing scenarioswhere we want to quickly create andtear down a database without theoverhead of a full-fledged databaseserver. We will use H2 for our unittests to ensure that our databaseinteractions are working correctlywithout needing to set up an actualMySQL or PostgreSQL databaseduring development.
○ MySQL and PostgreSQL JDBCDrivers are included asdependencies but commented out.We will use MySql in future usecases and that time we willuncomment them and provide thecorrect versions to use MySQL orPostgreSQL as database instead ofH2. This will allow you to connect tothose databases using JDBC andperform database operations asneeded.
○ Maven Shade Plugin is included tocreate a fat JAR (also known as anuber JAR) that packages alldependencies into a singleexecutable JAR file. This is useful fordeployment and distribution of theapplication, as it allows us to run theapplication without needing tomanage external dependenciesseparately.
○ Maven Surefire Plugin is included torun our unit tests during the buildprocess. It allows us to specifywhich test classes to include andprovides configuration options forrunning tests, generating reports,and handling test failures.  
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 14/48
Step 2B: pom.xml Structure for Mavenconfiguration
Copy the pom.xml from the URL link and create apom.xml file in the location as shown in theProject Folder Structure shown below. Pleaseensure you are using the correct version ofdependencies and plugins as per your local setup.
1.1 pom.xml Image
1.1 pom.xml Image
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 15/48
1.2 pom.xml Image
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 16/48
1.3 pom.xml Image
Step 3: Execute Maven Commands
Step 3.1: Clean and Compile
If all went well you should see the following imageon compiling with command `mvn clean compile`
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 17/48
Step 3.2: Run the application
If all went well you should see the following imageon running the Quantity Measurement App withcommand `mvn exec:java`
Step 4: Database Configuration
Step 4A: Ensure Database Dependencies topom.xml
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 18/48
Step 4B: Create application.properties
Create file:`src/main/resources/application.properties`
Add the following properties to`application.properties` for database configurationand connection pooling settings. Also addEnvironment specific properties for developmentand production databases. This will allow us toeasily switch between different databaseconfigurations based on the environment we arerunning in.
Step 4C: Add Logging Configuration toapplication.properties
Step 4D: Create Database Schema
Create the database schema for both productionand development/test databases. The productiondatabase will be used for actual application runs,
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 19/48
while the test database will be used fordevelopment, unit and integration testing. Theschema includes tables for storing quantitymeasurement entities and a history table for audittrails.
We will use H2 for development and in the curretUC16 and MySQL in future use cases as wedevelop the Quantity Measurement into a FullStack App with Spring Backend. The schemadefinitions are provided below.
schema.sql (Production Database):Copy the below sql and create a schema.sql file.The location is shown in the Project FolderStructure is `src/main/resources/db/schema.sql`
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 20/48
Step 5: Create Database Utilities
Step 5A: Create DatabaseConfig.java:
The purpose of `ApplicationConfig` class is toload database configuration properties from the`application.properties` file and provide acentralized way to access these propertiesthroughout the application. It also supportsenvironment-specific configurations, allowing us toeasily switch between different database settingsfor development, testing, and productionenvironments.
Please refer to the code snippet for `ApplicationConfig.java` in the ImplementationHint Section, which will be placed in thelocation `src/main/java/com/app/quantitymeasurement/util/`
Step 5B: ConnectionPool.java
The purpose of `ConnectionPool` class is tomanage a pool of database connections efficiently.It uses the configuration providedby `ApplicationConfig` to initialize a pool ofconnections that can be reused throughout theapplication. This helps in improving performanceby reducing the overhead of creating and closingdatabase connections frequently. The connectionpool also handles connection timeouts, idleconnections, and ensures that the maximum poolsize is not exceeded.
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 21/48
Please refer the code snippet for `ConnectionPool.java` in the Implementation HintSection and will be placed in thelocation `src/main/java/com/app/quantitymeasurement/util/`
Step 6: Update Exception Hierarchy
Please create a DatabaseException.java: file inthe location`src/main/java/com/app/quantitymeasurement/exception/` forhandling database related exceptions. Thisexception will be used to encapsulate anyexceptions that occur during database operationsand provide meaningful error messages to theupper layers of the application.
Please refer the code snippet for`DatabaseException.java` below and will beplaced in thelocation `src/main/java/com/app/quantitymeasurement/exception/`
Step 7: Implement Database Repository
The purposeof `QuantityMeasurementDatabaseRepository`
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 22/48
class is to provide an implementation ofthe `IQuantityMeasurementRepository` interfacethat interacts with a relational database to performCRUD operations for quantity measuremententities. This repository will use JDBC to connectto the database, execute SQL queries, andmanage the persistence of quantity measurementdata. It will also handle any database-relatedexceptions and ensure that resources are properlymanaged.
The IQuantityMeasurementRepository interface isenhanced to do the following:
● Add methods for retrieving measurementsby operation type and measurement type.Include a method for getting the total countof measurements in the repository, whichcan be useful for monitoring and reportingpurposes.
● Add a method for deleting allmeasurements from the repository, whichcan be useful for testing purposes or forresetting the state of the application.
● Add default methods for getting poolstatistics and releasing resources. ThegetPoolStatistics() method can beimplemented by repositoryimplementations that use connectionpooling to provide insights into the currentstate of the connection pool, such as thenumber of active connections, idleconnections, and total connections. Thiscan be useful for monitoring anddebugging database connection issues.
● Add default methodfor releasingResources() held by therepository, such as closing databaseconnections or clearing caches. Thismethod can be implemented by repositoryimplementations that manage resources toensure proper cleanup when the repositoryis no longer needed.
Please refer the code snippet for`QuantityMeasurementDatabaseRepository.java` inthe Implementation Hint Section and will beplaced in the location`src/main/java/com/app/quantitymeasurement/repository/`
Step 8: Update Service to Support BothRepositories
The `QuantityMeasurementServiceImpl` class willbe updated to support both the in-memory cacherepository and the database repository. This willallow us to switch between different storageimplementations based on configuration orruntime conditions. The service will delegate thepersistence of quantity measurement entities to theappropriate repository while still performing allbusiness logic and operations as before.
Since the repository is injected using DependencyInjection into the service, we can easily switchbetween different implementations (e.g., in-memory cache or database) without changing theservice logic. The service will also handle anyexceptions that may arise from the repository and
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 23/48
ensure that meaningful error messages arepropagated to the upper layers of the application.
Step 9: Update Application Entry Point
The Application entry point will be updated toinitialize the appropriate repository based onconfiguration and run the application as before. Itwill also include logging to indicate whichrepository is being used and any relevant statisticsabout the repository (e.g., number ofmeasurements stored, connection pool status). Themain method will remain the same, but theinitialization logic will be enhanced to supportboth repositories seamlessly.
Following are the enhancements made in thisUC16 version of the Quantity MeasurementApplication:  
● Refered ApplicationConfig class todetermine which repository implementationto use (cache or database) based on theapplication configuration. This allows forflexibility in choosing the repositoryimplementation without changing the code.
● Added logging using Java's built-in loggingframework to log application events anderrors. This helps in monitoring theapplication and troubleshooting.
● Added a method `closeResources()` to the`QuantityMeasurementApp` class to closeany resources held by the repository whenthe application is shutting down. Thisensures proper cleanup of resources andprevents potential memory leaks.
● Added a method`deleteAllMeasurements()` to the`QuantityMeasurementApp` class to deleteall measurements from the repository. Thiscan be useful for testing purposes to clearthe repository before running tests or toreset the state of the application.
● Updated the main method to report allmeasurements stored in the repository atthe end of the method. This allows forverification of the measurements stored inthe repository after performing variousoperations on quantities. Additionally, themain method now includes a call to`deleteAllMeasurements()`
Please refer the code snippet for`QuantityMeasurementApp.java` in theImplementation Hint Section and will be placed inthe location`src/main/java/com/app/quantitymeasurement/`
Please refer to the code snippetfor `QuantityMeasurementApp.java` in theImplementation Hint Section and will be placed inthe location`src/main/java/com/app/quantitymeasurement/`
Postconditions
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 24/48
● The Professional Maven project structure isfully established with proper packageorganization.● POM.xml configured with all necessarydependencies (JDBC drivers, testingframeworks).● Database schema created with propertables and indexes for productiondatabase.● Test database configured using H2 forcurrent development and future will be forisolated unit and integration testing.● QuantityMeasurementDatabaseRepositoryfully implemented with JDBC operations.● Connection pooling implemented forefficient database resource management.● Custom exception hierarchy extendedwith DatabaseException for database-specific errors.● All UC1–UC15 functionality preserved andtested with database persistence.● Services support both cache and databaserepository through dependency injection.● Proper error handling and loggingimplemented throughout.● Maven commands for building, testing,and packaging fully functional.● Database operations secured against SQLinjection through parameterized queries.● Transaction management implemented fordata consistency.● All measurements persisted to databaseautomatically during operations.● Historical data accessible throughrepository query methods.● Connection pool statistics available formonitoring database performance.
HINTS FOR IMPLEMENTING UC14:
1. ApplicationConfig.java
Use `ApplicationConfig` to load databaseconnection propertiesfrom `application.properties`. This allows forflexible configuration and environment-specificsettings. Please refer the code snippetfor `ApplicationConfig.java` in the location`src/main/java/com/app/quantitymeasurement/util/`
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 25/48
UC16 Code Snippet 1.1 ApplicationConfig javaClass
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 26/48
UC16 Code Snippet 1.2 ApplicationConfig javaClass
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 27/48
UC16 Code Snippet 1.3 ApplicationConfig javaClass
2. ConnectionPool.java
Implement `ConnectionPool` to manage a pool ofdatabase connections efficiently. This class willhandle creating, reusing, and closing connectionsto the database. It will also manage connectiontimeouts and ensure that the maximum pool size isnot exceeded. Please refer the code snippetfor `ConnectionPool.java` in the location`src/main/java/com/app/quantitymeasurement/util/`
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 28/48
UC16 Code Snippet 2.1 ConnectionPool javaClass
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 29/48
UC16 Code Snippet 2.2 ConnectionPool javaClass
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 30/48
UC16 Code Snippet 2.3 ConnectionPool javaClass
3. DatabaseException.java
Create `DatabaseException` to handle database-related errors and provide meaningful messages.This exception will be used to encapsulate anyexceptions that occur during database operationsand provide context for error handling in theservice layer. Please refer the code snippet for`DatabaseException.java` in the location`src/main/java/com/app/quantitymeasurement/exception/`
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 31/48
UC16 Code Snippet 3.1 DatabaseException javaClass
4. QuantityMeasurementDatabaseRepository.java
Implement `QuantityMeasurementDatabaseRepository` usingJDBC to perform CRUD operations on thedatabase. This repository will implement the`IQuantityMeasurementRepository` interface andprovide methods to save measurements, retrieveall measurements, query by operation ormeasurement type, and delete measurements. Itwill also handle database exceptions and ensureproper resource management. Please refer thecode snippet for`QuantityMeasurementDatabaseRepository.java` inthe location`src/main/java/com/app/quantitymeasurement/repository/`
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 32/48
UC16 Code Snippet 4.1QuantityMeasurementDatabaseRepository javaClass
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 33/48
UC16 Code Snippet 4.2QuantityMeasurementDatabaseRepository javaClass
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 34/48
UC16 Code Snippet 4.3QuantityMeasurementDatabaseRepository javaClass
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 35/48
UC16 Code Snippet 4.4QuantityMeasurementDatabaseRepository javaClass
5. Update Service, Controller and Application
● Update `QuantityMeasurementServiceImpl` tosupport both cache and database repositoriesthrough dependency injection. The serviceshould delegate persistence to the repositorywithout needing to know about the underlyingimplementation. There is practically no changeneeded in the service logic since it interactswith the repository through the interface. Smallrefactoring is needed because of theincorporation of the new package structureresulting in more imports along with the SLF4Jlogging. Please refer Step 1B for details onhow to implement this.
● Update `QuantityMeasurementController` touse the service layer as before, withoutneeding to know about the underlyingrepository implementation. The controllershould continue to handle user input andoutput as before, while the service layermanages the business logic and persistence.There is no change needed in the controllerlogic since it interacts with the service layer,which abstracts away the repositoryimplementation. Small refactoring is needed
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 36/48
because of the incorporation of the newpackage structure resulting in more importsalong with the SLF4J logging. Please refer Step1B for details on how to implement this.
● Update `QuantityMeasurementApp` to initializethe appropriate repository based onconfiguration. This may involve reading fromthe `application.properties` to determine whichrepository to use (cache or database) andinitializing the service layer accordingly. Themain method will remain the same, but theinitialization logic will be enhanced to supportboth repositories seamlessly. Further smallrefactoring is needed because of theincorporation of the new package structureresulting in more imports along with the SLF4Jlogging. Please refer Step 1B for details onhow to implement this.
6. Write unit tests for each layers
a. QuantityMeasurementDatabaseRepository– Please refer code snippet for theQuantityMeasurementDatabaseRepositoryTest.java inthe section Code Snippet for Test Cases
b. QuantityMeasurementServiceImpl – In asimilar manner write the codeQuantityMeasurementServiceTest.java totest the service layer directly and place thecode in thefolder src/test/java/com/app/quantitymeasurement/service
c. QuantityMeasurementController – In asimilar manner write the codeQuantityMeasurementControllerTest.java totest the service layer directly and place thecode in thefolder src/test/java/com/app/quantitymeasurement/controller
7. Write integration tests to verify end-to-endfunctionality with database persistence.
Please refer code snippet for theQuantityMeasurementIntegrationTest.java in thesection Code Snippet for Test Cases
Example Output of running theApp
Example 1: Saving a Quantity Comparison toDatabase
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 37/48
Example 2: Retrieving Measurements by Type
Example 3: Connection Pool Management
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 38/48
Concepts Learned byImplementing UC16:
1. Maven Project Structure
● Standard directory hierarchy(src/main/java, src/main/resources,src/test/java, etc.)● Proper package organization bylayer (controller, service, repository,entity)● Maven conventions enable teamcollaboration and toolingintegration.
2. JDBC (Java Database Connectivity)
● Low-level database access API forconnecting to relational databases.● Provides standard interface fordifferent database vendors.● Requires explicit connection,statement, and result setmanagement.
3. Connection Pooling
● Maintains pool of reusable databaseconnections.● Reduces overhead ofopening/closing connectionsrepeatedly.● Improves application performanceand resource utilization.● Thread-safe connectionmanagement.
4. Parameterized SQL Queries
● Prevents SQL injection attacks byseparating SQL from data.● Uses ? placeholders for parameters.● PreparedStatement automaticallyhandles escaping and typeconversion.
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 39/48
5. ResourceManagement
● Proper closing of ResultSet,Statement, and Connection objects.● Try-catch-finally or try-with-resourcesblocks ensure cleanup.● Prevents resource leaks andconnection exhaustion.
6. Exception Hierarchy
● Custom exceptions extend standardJDBC exceptions.● Provide meaningful context for errorhandling upstream.● Enable specific error handling indifferent layers.
7. Database Schema Design
● Tables represent business entities(QuantityMeasurementEntity).● Indexes improve queryperformance.● Foreign keys maintain referentialintegrity.● Timestamps track operation timing.
8. Separation of Concerns in Persistence
● Repository layer handles alldatabase operations.● Service layer knows nothing aboutdatabase mechanism.● Easy to swap repositoryimplementations (cache vs.database).
9. Configuration Management
● Properties files separateconfiguration from code.● Enable different configurations fordifferent environments (dev, test,prod).● Support system properties forruntime configuration.
10.Testing with Mock Databases
● H2 in-memory database for fast,isolated tests.● No need for production databasesetup for testing.● Transactional rollback between testsfor clean state.
11.Maven POM Configuration
● Dependencies declared centrally.● Build plugins configure compilation,testing, packaging.● Version management simplifieslibrary updates.
12.SQL Best Practices
● Industry-standard SQL for cross-database compatibility.● Meaningful column names and tableorganization.● Proper data types for efficiency.● Constraints ensure data quality.
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 40/48
13.Layer Integration
● Controller passes data to service asDTOs.● Service orchestrates business logicand repository calls.● Repository translates betweenobjects and database.● Each layer independent andtestable.
14.Transaction Management
● Multiple database operationsgrouped as atomic unit.● All-or-nothing semantics ensureconsistency.● Rollback on error prevents partialupdates.
15.Performance Considerations
● Connection pooling reducesconnection overhead.● Batch operations reduce round-tripsto database.● Indexes accelerate queries.● Lazy loading different from eagerloading for optimization.
Key Concepts Tested:
1. JDBC Connection Management
● Connections successfully created.● Connection pooling active andefficient.● Resource cleanup occurs properly.
2. SQL Query Execution
● INSERT statements save datacorrectly.● SELECT statements retrieve dataaccurately.● Parameterized queries preventinjection.
3. Data Persistence
● Data survives application restarts.● Multiple operations accumulate indatabase.● Historical data accessible viaqueries.
4. Error Handling
● Database errors wrapped inDatabaseException.● Connection failures capturedgracefully.● Query failures don't crashapplications.
5. Repository Methods
● save() stores entities correctly.● getAllMeasurements() returns alldata.● getMeasurementsByOperation()filters correctly.
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 41/48
● getMeasurementsByType() queriesby category.● deleteAll() removes all records.● getTotalCount() returns an accuratecount.
6. Configuration Loading
● Properties loaded fromapplication.properties.● System properties override defaults.● Environment-specific configurationswork.
7. Maven Build Process
● mvn clean compile buildssuccessfully.● mvn clean test runs all tests.● mvn clean package creates JAR.● Dependencies resolved frompom.xml.
8. Package Structure
● Classes organized by layer.● Clear separation of concerns.● Easy navigation and maintenance.
9. Test Database
● H2 database initialized for tests.● Schema created before tests run.● Data isolated between tests.
10.Backward Compatibility● All UC1–UC15 tests pass withoutmodification.● Behavior identical to cache-basedversion.● Service layer unaware ofpersistence method.
Test Case Examples:
1. testMavenBuild_Success()
● Verifies project builds successfullywith Maven.● Command: mvn clean compile
2. testPackageStructure_AllLayersPresent()
● Verifies controller, service,repository packages exist.● Verifies proper organization.
3. testPomDependencies_JDBCDriversIncluded()
● Verifies MySQL, PostgreSQL, H2drivers in pom.xml.● Verifies testing libraries included.
4. testDatabaseConfiguration_LoadedFromProperties()
● Verifies ApplicationConfig loadsproperties.● Verifies fallback to defaults.
5. testConnectionPool_Initialization()
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 42/48
● Verifies ConnectionPool createsspecified number of connections.● Verifies all connections initiallyavailable.
6. testConnectionPool_Acquire_Release()
● Verifies connection acquired frompool.● Verifies connection returned topool.● Verifies statistics updated correctly.
7. testConnectionPool_AllConnectionsExhausted()
● Acquires all connections from pool.● Verifies error when pool exhausted.
8. testDatabaseRepository_SaveEntity()
● Creates QuantityMeasurementEntity.● Calls repository.save().● Verifies data in the database.
9. testDatabaseRepository_RetrieveAllMeasurements()
● Saves multiple entities.● Callsrepository.getAllMeasurements().● Verifies correct number and datareturned.
10.testDatabaseRepository_QueryByOperation()
● Saves entities with differentoperations.● Callsrepository.getMeasurementsByOperation().● Verifies filtering works correctly.
11.testDatabaseRepository_QueryByMeasurementType()
● Saves entities with differentmeasurement types.● Callsrepository.getMeasurementsByType().● Verifies type filtering accurate.
12.testDatabaseRepository_CountMeasurements()
● Saves a known number of entities.● Calls repository.getTotalCount().● Verifies count matches.
13.testDatabaseRepository_DeleteAll()
● Saves entities.● Calls repository.deleteAll().● Verifies count becomes zero.
14.testSQLInjectionPrevention()
● Attempts SQL injection in queryparameter.● Verifies parameterized queryprevents execution.● Verifies parameter treated as literalvalue.
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 43/48
15.testTransactionRollback_OnError()
● Saves entity.● Simulates error during operation.● Verifies transaction rolled back.● Verifies data not persisted.
16.testDatabaseSchema_TablesCreated()
● Verifiesquantity_measurement_entity tableexists.● Verifiesquantity_measurement_history tableexists.● Verifies indexes created.
17.testH2TestDatabase_IsolationBetweenTests()
● Test 1 saves data.● Test 2 verifies database is clean(empty).● Verifies data isolation.
18.testRepositoryFactory_CreateCacheRepository()
● Factory creates cache-basedrepository.● Verifies correct type returned.
19.testRepositoryFactory_CreateDatabaseRepository()
● Factory creates database-basedrepository.● Verifies correct type returned.
20.testServiceWithDatabaseRepository_Integration()
● Creates service with databaserepository.● Performs comparison operation.● Verifies data persisted to database.
21.testServiceWithCacheRepository_Integration()
● Creates service with cacherepository.● Performs comparison operation.● Verifies data in cache (notdatabase).
22.testMavenTest_AllTestsPass()
● Runs all tests via Maven Surefire.● Command: mvn clean test● Verifies all tests pass.
23.testMavenPackage_JarCreated()
● Runs Maven package phase.● Verifies JAR created in target/.● Verifies JAR executable with mainclass.
24.testDatabaseRepositoryPoolStatistics()
● Gets pool statistics.● Verifies statistics format correct.● Verifies statistics accurate.
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 44/48
25.testMySQLConnection_Success()
● Attempts connection to MySQL (ifavailable).● Verifies successful connection.● Creates quantity table.
26.testPostgreSQLConnection_Success()
● Attempts connection to PostgreSQL(if available).● Verifies successful connection.● Creates quantity table.
27.testDatabaseRepository_ConcurrentAccess()
● Multiple threads access repositorysimultaneously.● Verifies connection pool handlesconcurrency.● Verifies no data corruption.
28.testParameterizedQuery_DateTimeHandling()
● Saves entity with timestamp.● Retrieves from database.● Verifies timestamp preserved.
29.testDatabaseRepository_LargeDataSet()
● Saves 1000+ entities.● Queries all measurements.● Verifies performance acceptable.
30.testMavenClean_RemovesTargetDirectory()
● Runs mvn clean.● Verifies target directory removed.● Verifies rebuild works correctly.
31.testPropertiesConfiguration_EnvironmentOverride()
● Sets system property for repositorytype.● Creates appropriate repository.● Verifies system property takesprecedence.
32.testDatabaseException_CustomException()
● Database error occurs.● Verifies DatabaseException thrown.● Verifies meaningful error message.
33.testResourceCleanup_ConnectionClosed()
● Performs query operation.● Verifies ResultSet closed.● Verifies Statement closed.● Verifies Connection released topool.
34.testBatchInsert_MultipleEntities()
● Saves multiple entities insuccession.● Verifies all saved efficiently.● Verifies pool doesn't exhaust.
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 45/48
35.testPomPlugin_Configuration()
● Verifies Maven plugins configured.● Verifies compiler plugin has correctJava version.● Verifies Surefire plugin includestests.
Code Snippet for Test Cases
1. Write unit tests for each layers
a. QuantityMeasurementDatabaseRepository– Please refer code snippet for theQuantityMeasurementDatabaseRepositoryTest.java andplace it in the foldersrc/test/java/com/app/quantitymeasurement/repository
UC16 Code Snippet 6.aQuantityMeasurementDatabaseRepositoryTest javaClass
b. QuantityMeasurementServiceImpl – In asimilar manner write the codeQuantityMeasurementServiceTest.java totest the service layer directly and place thecode in thefolder src/test/java/com/app/quantitymeasurement/service
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 46/48
c. QuantityMeasurementController –Similarly write the codeQuantityMeasurementControllerTest.java totest the service layer directly and place thecode in thefolder src/test/java/com/app/quantitymeasurement/controller
2. Write integration tests to verify end-to-endfunctionality with database persistence.
Please refer code snippet for theQuantityMeasurementIntegrationTest.java andplace it in the foldersrc/test/java/com/app/quantitymeasurement/integrationTests
UC16 Code Snippet 7QuantityMeasurementIntegrationTest java Class
3. Run Maven Test
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 47/48
4. Run Maven Test
a. mvn test -Dtest=QuantityMeasurementIntegrationTest
UC16 1.1 Unit Test Results
b. mvn test -Dtest=QuantityMeasurementIntegrationTest
UC16 1.2 Unit Test Results
Published using Google Docs Report abuse Learn more
UC16: Database Integration with JDBC for Quantity Measurement Persisten…Updated automatically every 5minutes
19/06/2026, 08:43 UC16: Database Integration with JDBC for Quantity Measurement Persistence
https://docs.google.com/document/d/e/2PACX-1vSL8uKOHxa8nkJnjdNZPdiHtrRa9h96FfAU7yNbS4JsMEal-y2klSAogQ9W_85FK0Cdn9h_wje… 48/48


---
# UC17_ Spring Framework Integration - REST Services and JPA for Quantity Measurement(1)

UC17: Spring Framework Integration- REST Services and JPA for QuantityMeasurement
Description
UC17 transforms the standalone Quantity Measurement Applicationinto a Spring Boot-based REST service by leveraging SpringFramework's powerful ecosystem. This use case maintains allexisting business logic, entities, and architectural patterns whilemodernizing the persistence layer with Spring Data JPA andexposing functionality through RESTful HTTP endpoints.
The refactoring provides:
● Spring Boot Application: Simplified configuration andauto-configuration capabilities● REST Controllers: RESTful API endpoints for quantitymeasurements with JSON/XML support● Spring Data JPA: Object-Relational Mapping eliminatingraw JDBC boilerplate● Spring Service Layer: Integration with Spring'stransactional support and dependency injection● Spring Data Repositories: Declarative query methodsreplacing custom JDBC code● REST Exception Handling: Centralized error handling withappropriate HTTP status codes● API Documentation: Swagger/Springfox integration forautomatic API documentation● Spring Security: Optional authentication and authorization(foundation for future)● Testing with Spring Boot Test: MockMvc for testing RESTendpoints● Actuator: Application monitoring and health checks● Embedded Tomcat Server: No external application serverrequired
UC17 demonstrates enterprise-grade Java development usingindustry-standard frameworks, enabling easy integration with cloudplatforms, microservices architectures, and third-party services.
UC17 is designed to be backward compatible with UC16, allowingfor a smooth transition while preserving all existing functionality.The use of Spring Boot and Spring Data JPA significantly reducesboilerplate code, improves maintainability, and enhancesdeveloper productivity while providing a robust foundation forfuture enhancements.
UC17 will be implemented in multiple steps, starting with settingup the Spring Boot project structure and gradually refactoring theexisting codebase to leverage Spring's features while ensuring thatall existing functionality is preserved and tested throughout theprocess. Broadly UC17 will involve the following steps:
1. The implementation will involve creating REST controllers forhandling HTTP requests, refactoring the service layer to useSpring's dependency injection and transactional support, andreplacing the JDBC-based repository with Spring Data JPArepositories. The application will be configured to use anembedded H2 database for development and testing, with theoption to switch to MySQL or PostgreSQL for production throughconfiguration. The REST API will be designed to follow bestpractices, including proper HTTP methods (GET, POST, PUT,DELETE), status codes, and content negotiation for JSON/XMLresponses. Spring Security can be integrated to secure theendpoints with basic authentication or JWT tokens.
2. Validation will be added to the REST controllers to ensure thatincoming requests contain valid data, and appropriate errorresponses will be returned for invalid input.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 1/60
3. Global exception handling will be implemented using Spring's`@ControllerAdvice` to provide consistent error responses acrossthe API.
4. The application will also include comprehensive testing at eachstep to ensure that the application remains stable and functional aswe transition to the new architecture. This includes unit tests forindividual components, integration tests for the service layer, andend-to-end tests for the REST API endpoints.
5. Finally, API documentation will be generated usingSwagger/OpenAPI to provide clear and interactive documentationfor the REST endpoints, making it easier for developers tounderstand and consume the API.
Disadvantages of UC16 Implementation (ThatUC17 Addresses)
UC16 provided robust JDBC persistence but still requiredsignificant boilerplate code:
1. JDBC Boilerplate Code
● Manual connection management despite connectionpooling.● Repetitive ResultSet mapping to objects.● Try-catch-finally blocks cluttering business logic.● Resource cleanup code duplicated across methods.
2. Query Complexity Without ORM
● Complex relationships are difficult to model.● Manual SQL writing error-prone and database-specific.● Query optimization knowledge required.● No automatic lazy/eager loading strategies.
3. Transaction Management Complexity
● Manual transaction demarcation.● Rollback handling mixed with business logic.● No declarative transaction management.● Difficult to manage cross-method transactions.
4. Limited Framework Integration
● Cannot easily integrate with Spring ecosystem.● Difficult to use Spring Security for authentication.● No built-in caching support.● Message queueing integration complex.
5. HTTP Exposure Limitations
● No built-in REST framework.● Manual JSON serialization/deserialization.● Content negotiation requires custom code.● HTTP status code mapping manual.
6. Lack of Dependency Injection
● Manual object creation and wiring.● No scope management (singleton, prototype,request, session).● Difficult to test with mocks.● Configuration scattered across the codebase.
7. Testing Complexity
● Integration tests require database setup.● Unit tests are difficult without a mocking framework.● No transactional test support.● Test data management manual.
8. Application Lifecycle Management
● No centralized configuration management.● No application events or listeners.● Shutdown hooks manual.● Startup sequence implicit.
9. Security Concerns
● SQL injection risk despite parameterized queries.● No built-in CORS support.● Authentication/authorization manual.● No API rate limiting.
10.Monitoring and Operations
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 2/60
● No built-in health checks.● Metrics collection requires manual implementation.● Logging inconsistent across layers.● No performance monitoring built-in.
11.Scalability Issues
● Tight coupling to JDBC driver.● Difficult to scale to microservices.● No built-in caching strategies.● API versioning requires manual management.
12.Developer Experience
● Steep learning curve for JDBC.● Verbose code reduces readability.● IDEs provide limited support.● Refactoring is risky.
Preconditions
● All functionality from UC1–UC16 is fully operational withJDBC persistence.● Understanding of Spring Framework concepts (dependencyinjection, AOP, etc.).● Spring Boot fundamentals knowledge.● Maven configured and working.● Java 11+ installed.● IDE with Spring Boot support (IntelliJ, Eclipse, VS Code).● HTTP client for testing REST endpoints (curl, Postman,Insomnia).● Understanding of REST principles and HTTP methods.● JPA/Hibernate fundamentals knowledge.
Main Flow
Step 1: Generate Spring Boot Project Using Spring Initializer
Spring Initializer is an online tool that generates a Spring Bootproject template with proper configuration. It eliminates manualsetup and ensures best practices.
Step 1A: Access Spring Initializer
● Visit: https://start.spring.io/
Step 1B: Configure Project Settings
Please refer below the image snapshot of Spring Initializerconfiguration for visual reference.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 3/60
UC17 Spring Initializer Visual Reference
Step 1C: Generate and Extract
● Click "Generate" to download the ZIP file. Extract to yourworkspace.
Step 1D: Project Structure Generated
Step 4: Create TemperatureUnit Enum
● Open the existing Quantity Measurement App project inyour IDE (IntelliJ, Eclipse, VS Code). Create a new folderfor the Spring Boot application. Copy the generated SpringBoot project files into this folder.
Step 2: Migrate Generated Spring Boot Project to ExistingQuantity Measurement App
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 4/60
Step 2A: pom.xml Configuration
● Update the existing `pom.xml` to include Spring Bootdependencies and plugins. Ensure the parent is set toSpring Boot Starter Parent and add necessary dependenciesfor web, JPA, security, testing, etc.
● Please refer to the updated `pom.xml` snippet below for therequired dependencies and plugins. This is a critical step toensure the Spring Boot application is properly configuredand can leverage all the features of the Spring ecosystem.This is exactly the same as the `pom.xml` content providedin the previous response, only with deleted comments andplaceholders removed for clarity.
● Here is also the link to the updated `pom.xml` file forreference: [Updated pom.xml](https://tinyurl.com/quantitypomxml)
● Save the old pom.xml as `pom.xml.bak` before makingchanges, so you can refer back to it if needed. Copy andpaste the new content, ensuring to merge any customconfigurations you had in the old `pom.xml` that are notrelated to Spring Boot.
Step 2B: Copy Quantity Measurement Application Code fromSpring Boot Structure
● Copy the generated Spring Boot Application class to theexisting project. This means copyingthe QuantityMeasurementAppApplication.java file to theappropriate package in your existing project structure at thelocation src/main/java/com/app/quantitymeasurement/.
Alternatively, Linux and Mac users can use link command to linkthe file to the local directory - ` ln -s ../../quantity-measurement-app.`
Step 2C: Modify application.properties
● There is practically no change in the existingapplication.properties file except add the Spring Bootspecific property for application name. You can refer to theupdated application.properties content provided in theprevious UC16 for the required properties. Please add thefollowing
spring.application.name=quantity-measurement-app
Step 2D: Create empty resource directories for future use
Step 2E: Copy the Quantity Measurement Application TestCode
● Copy the generated Spring Boot test class to the existingproject. This means copyingthe QuantityMeasurementAppApplicationTests.java file to theappropriate package in your existing project structure at thelocation src/test/java/com/app/quantitymeasurement/.
Step 2F: Copy help.md, mvnw and mvnw.cmd files
● Copy the help.md, mvnw, and mvnw.cmd files from thegenerated Spring Boot project to the existing project. Thiswill allow you to use Maven Wrapper commands for
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 5/60
building and running the application without requiring aglobal Maven installation.
Step 2G: Move Quantiy Measurement Application to dumpfolder
● The QuantityMeasurementApp.java class created in UC16 isno longer needed as we will be creating a new Spring BootApplication class. Move this file to a dump folder forreference if needed in the future.
Step 2H: Move UC16 Test Java Class to dump folder
● The QuantityMeasurementIntegrationTest.java class createdin UC16 is no longer needed as we will be creating newtest classes using Spring Boot Test framework. Move this fileto a dump folder for reference if needed in the future.Similarly you can moveQuantityMeasurementDatabaseRepositoryTest.java if it existsto the dump folder as well.
Step 2I: Compile and Run the Spring Boot Application
● Congrats! You have successfully migrated the generatedSpring Boot project structure into your existing QuantityMeasurement Application. Now you can compile and runthe Spring Boot application to ensure everything is set upcorrectly.
● If there are any errors, check the logs for details and resolvethem before proceeding to the next steps. Please refer tothe detailed screenshot below for the expected output after`mvn clean install` and after `mvn spring-boot:run`. Also youcan access the H2 console at `http://localhost:8080/h2-
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 6/60
console` to verify the database connection and schemacreation.
Step 2J: Move files related to JDBC repository to dump folder
● The Repository files:○ the Interface FilesIQuantityMeasurementRepository.java○ the Implementation FilesQuantityMeasurementDatabaseRepository.java forcaching○ the QuantityMeasurementCacheRepository.java fordatabase persistence
● Created in UC16 are no longer needed as we will becreating a new repository interface using Spring Data JPA.Move these files to a dump folder for reference if needed inthe future.
Note: Add dump folder to .gitignore to avoid committing thesefiles to version control.
Step 3: Convert Entities to JPA Entities
● Firstly refactor the package name from `entity` to `model`for better clarity and separation of concerns.
● Update QuantityMeasurementEntity.java to add JPAannotations and map it to a database table. This involvesadding @Entity, @Table, and appropriate column mappings.You can also add indexes for commonly queried fields toimprove performance. Please refer to the updatedQuantityMeasurementEntity.java content provided in theprevious response for the required changes. This is exactlysame as the QuantityMeasurementEntity.java contentprovided in the previous UC16, only with deleted commentsand placeholders removed for clarity. Please refer to theImage snapshots of the updatedQuantityMeasurementEntity.java file with JPA annotationsand Lombok annotations for reducing boilerplate code
● Please find the explanation of the JPA annotations used inthe QuantityMeasurementEntity.java file below:
○ @Entity: Marks the class as a JPA entity, which meansit will be mapped to a database table.○ @Table: Specifies the name of the database tableand allows defining indexes for performanceoptimization.○ @Id: Marks the primary key field of the entity.○ @GeneratedValue: Specifies the strategy forgenerating primary key values (e.g., auto-increment).○ @Column: Maps the fields to database columns andallows specifying constraints like nullable.○ @PrePersist and @PreUpdate: Lifecycle callbacks toautomatically set timestamps for creation andupdates.
● Please ensure to add the Lombok annotations (@Data,@NoArgsConstructor, @AllArgsConstructor) to reduceboilerplate code for getters, setters, constructors, and otherutility methods. Make sure to have Lombok dependency inyour pom.xml and your IDE configured to support Lombok.Becuase of Lombok annotations, you can remove defaultconstructor, toString and equals method from the existingQuantityMeasurementEntity class and also any manuallywritten getters and setters to keep the code clean andconcise.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 7/60
Step 3A: Attach Image Snapshot of the updated`QuantityMeasurementEntity.java` file with JPA annotations andlombok annotations for reducing boilerplate code
UC17 Code Snippet 3.1 QuantityMeasurementEntity java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 8/60
UC17 Code Snippet 3.2 QuantityMeasurementEntity java Class
UC17 Code Snippet 3.3 QuantityMeasurementEntity java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI74… 9/60
Step 4: Convert Repository Layer to Spring Data JPA
● The repository layer will be refactored to use Spring DataJPA. This involves creating an interface thatextends JpaRepository and defining query methods basedon method naming conventions or using @Queryannotations for custom queries. This eliminates the need formanual SQL and JDBC code, allowing you to focus onbusiness logic.
● Since we are using Spring Data JPA, we can leverage itspowerful features to simplify our data access layer. We willcreate a new repository interface calledQuantityMeasurementRepository that extends JpaRepository.This will provide us with basic CRUD operations withoutneeding to write any SQL or JDBC code. We can alsodefine custom query methods based on the namingconventions provided by Spring Data JPA, or usethe @Query annotation for more complex queries.
● Hence the IQuantityMeasurementRepository interface willbe replaced with QuantityMeasurementRepository interfacethat extends JpaRepository<QuantityMeasurementEntity,Long>. We will define methods likefindByOperation, findByThisMeasurementType, findByCreatedAtAfter,and custom queries using @Query annotation to retrievedata based on specific criteria.
● Please refer to the Image snapshots of the updatedQuantityMeasurementRepository.java file with Spring DataJPA repository interface and query methods.
● Please find the explanation of the Spring Data JPArepository interface and query methods used inthe QuantityMeasurementRepository.java file below:
○ extends JpaRepository<QuantityMeasurementEntity,Long>: This indicates that the repository is a JPArepository for the QuantityMeasurementEntity classwith a primary key of type Long. It provides basicCRUD operations out of the box.○ findByOperation(String operation): This method willautomatically generate a query to find allQuantityMeasurementEntity records where theoperation field matches the provided value.○ findByThisMeasurementType(StringmeasurementType): This method will generate aquery to find all records where thethisMeasurementType field matches the providedvalue.○ findByCreatedAtAfter(LocalDateTime date): Thismethod will generate a query to find all recordswhere the createdAt field is after the specified date.○ @Query: This annotation allows you to define acustom JPQL query. In this case, it retrieves allrecords where the operation matches the providedvalue and isError is false.○ countByOperationAndIsErrorFalse(Stringoperation): This method will generate a query tocount the number of records where the operationmatches the provided value and isError is false.○ findByIsErrorTrue(): This method will generate aquery to find all records where the isError field istrue.
● Here are the Annotations used inthe QuantityMeasurementRepository.java file:
○ @Repository: This annotation indicates that theinterface is a Spring Data Repository, which is amechanism for encapsulating storage, retrieval, andsearch behavior. It also allows Spring to detect itduring component scanning and create a bean for it.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 10/60
Step 4A: Attach image snapshot of theupdated QuantityMeasurementRepository.java file with SpringData JPA repository interface and query methods.
UC17 Code Snippet 4.1 QuantityMeasurementRepository javaClass
Step 5: Quantity DTO Refactoring and Quantity MeasurementDTO Creation
Step 5A: Refactor package name from entity to model
● All the classes in the entity package will be moved to a newpackage named model to better reflect their purpose asdata models used for API communication and businesslogic, rather than being tightly coupled to databasepersistence. This is a common practice in Springapplications to separate concerns and improve codeorganization. The model package will contain classes thatrepresent the data structures used throughout theapplication, including DTOs (Data Transfer Objects) andentities that are mapped to database tables. The entitypackage will be removed after the refactoring is complete,and all references to the old package will be updated topoint to the new model package. This change will not affectthe functionality of the application but will improve theclarity and maintainability of the codebase.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 11/60
Step 5B: Refactor QuantityDTO
● The existing QuantityDTO class will be refactored to includevalidation annotations and to serve as a Data TransferObject (DTO) for the API layer. The validation annotationensures that the input data is valid when received from APIrequests. If they are invalid, appropriate error responsescan be returned to the client. The QuantityDTO will stillcontain fields for value, unit name, measurement type, andoperation type, but it will now also include validationconstraints to ensure that the data is valid before processingit in the service layer.
● The service layer will handle the conversion between theQuantityDTO and the QuantityModel<IMeasurable> used inthe business logic, allowing for a clean separation ofconcerns between the API layer and the service layer.
● Please find the explanation of the validation annotations andadditional fields used in the updated QuantityDTO.java filebelow:
○ @Data: This is a Lombok annotation that generatesgetters, setters, toString, equals, and hashCodemethods for the class, reducing boilerplate code.○ @NotEmpty: This annotation is used to validate thatthe annotated string field is not null and not empty. Itensures that the input for fields likethisMeasurementType and operationType is providedand not just an empty string.○ @NotNull: This annotation is used to validate that theannotated field is not null. It ensures that the inputfor fields like value is provided and not null, which isimportant for performing quantity measurementoperations.○ @Pattern: This annotation is used to validate that theannotated string field matches a specified regularexpression. It ensures that the input for fields likemeasurementType is one of the expected values. Forexample, you can use a regex pattern to ensure thatmeasurementType is either "LengthUnit","VolumeUnit", "WeightUnit", or "TemperatureUnit".○ @AssertTrue: This annotation is used to validate thata method returns true. It can be used to implementcustom validation logic that cannot be easilyexpressed with other annotations. For example, youcan use it to validate that the combination of valueand unitName is valid for the specifiedmeasurementType. This allows for more complexvalidation logic that goes beyond simple field-levelconstraints, ensuring that the data is not only presentbut also logically consistent.
● Please refer to the Image snapshots of the updatedQuantityDTO.java file with validation annotations andadditional fields for API communication. This is exactly thesame as the QuantityDTO.java content provided in theprevious UC16, only with added validation annotations.
Step 5B1: Attach image snapshot of theupdated QuantityDTO.java file with validation annotations andadditional fields for API communication.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 12/60
UC17 Code Snippet 5B.1 QuantityDTO java Class
UC17 Code Snippet 5B.2 QuantityDTO java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 13/60
UC17 Code Snippet 5B.3 QuantityDTO java Class
Step 5C: Create Quantity Measurement DTO for QuantityMeasurement Entity
● The QuantityMeasurementDTO class will be created to serveas a Data Transfer Object (DTO) for theQuantityMeasurementEntity. This DTO will be used totransfer data between the service layer and theREST controllers, providing a simplified and decoupledrepresentation of the entity. The DTO will contain fields thatare relevant for the API responses and requests, and it mayalso include validation annotations to ensure data integrity.The service layer will be responsible for converting betweenthe entity and the DTO as needed. Please refer to the Imagesnapshots of the QuantityMeasurementDTO.java file withfields, constructors, getters, setters, and validationannotations.
● You will notice that the QuantityMeasurementDTO classcontains fields that represent the data needed for quantitymeasurement operations, such as values, unit names,measurement types, operation type, result information, anderror details. This are exactly the same fields as in theQuantityMeasurementEntity class, but the DTO is designedto be used for API communication, while the entity isdesigned for database persistence. The service layer willhandle the conversion between these two classes, allowingfor a clean separation of concerns between the persistencelayer and the API layer.
● The QuantityMeasurementDTO class will also be annotatedwith Lombok annotations to reduce boilerplate code forgetters, setters, constructors, and other utility methods.Make sure to have Lombok dependency in yourpom.xml and your IDE configured to support Lombok.
● The QuantityMeasurementDTO class will be used in theREST controllers to get Quantity Measurement History byoperation type and to get Quantity Measurements bymeasurement type. It will also be used in the service layerfor performing quantity measurement operations andreturning results to the controllers.
● Also the QuantityMeasurementDTO class will include staticfactory methods for converting between the entity and DTOrepresentations. This provides a clear and centralized way
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 14/60
to handle the conversion logic, making it easier to maintainand ensuring consistency across the application. This usesStream API for mapping lists of entities to DTOs and viceversa, which is a common pattern in Spring applications tokeep the code clean and efficient. Here is the explanationof the static factory methods in theQuantityMeasurementDTO class:
○ fromEntity(QuantityMeasurementEntity entity): Thismethod takes a QuantityMeasurementEntity object asa parameter and returns a correspondingQuantityMeasurementDTO object. It maps the fieldsfrom the entity to the DTO, allowing for a cleanseparation between the persistence layer and the APIlayer.○ toEntity(): This method convertsthe QuantityMeasurementDTO instance back to aQuantityMeasurementEntity object. This is usefulwhen you want to save or update data in thedatabase using the repository layer, as it allows youto convert the DTO received from the API into anentity that can be persisted.○ fromEntityList(List<QuantityMeasurementEntity>entities): This method takes a listof QuantityMeasurementEntity objects and returns alist of corresponding QuantityMeasurementDTOobjects. It uses Java Stream API to map each entity inthe list to a DTO, providing an efficient way toconvert collections of entities to DTOs for APIresponses. Please find the explanation of the StreamAPI usage in this method below as well as the codesnippet for this method:
● toEntityList(List<QuantityMeasurementDTO> dtos): Thismethod takes a list of QuantityMeasurementDTO objects andconverts them into a list ofQuantityMeasurementEntity objects. Similar to the previousmethod, it uses Java Stream API to perform the mapping,allowing for efficient conversion of collections of DTOs toentities for persistence. In a similar way as the previousmethod, it converts the list of DTOs into a stream, mapseach DTO to an entity using the toEntity method, andcollects the results back into a list.
Step 5C1: Attach image snapshot ofthe QuantityMeasurementDTO.java file with fields, constructors,getters, setters, and validation annotations.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 15/60
UC17 Code Snippet 5C.1 QuantityMeasurementDTO java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 16/60
UC17 Code Snippet 5C.3 QuantityMeasurementDTO java Class
Step 5D: Create OperationType Enum
● The OperationType enum will be created to represent thedifferent types of operations that can be performed in thequantity measurement application, such as comparison,conversion, addition, and subtraction. This enum willprovide a type-safe way to represent these operationsthroughout the application, ensuring that only validoperation types are used.
○ The OperationType enum is used in theQuantityDTO, QuantityMeasurementDTO, and otherrelevant classes to specify the type of operationbeing performed or requested.○ It can also be used in the service layer to determinethe logic for handling different operations based onthe specified operation type.○ The OperationType enum will contain constants foreach operation type, and it can also include methodsfor converting from strings or for getting a list ofvalid operation types if needed.
● Please refer to the code snapshots ofthe OperationType.java class with enum constants forcomparison, conversion, addition, and subtractionoperations. Here is the explanation of the OperationTypeenum:
○ The OperationType enum defines a set of constantsthat represent the different types of operations thatcan be performed in the quantity measurementapplication. These constants include ADD,SUBTRACT, MULTIPLY, DIVIDE, COMPARE, andCONVERT.○ Each constant represents a specific operation thatcan be performed on quantities, such as adding twoquantities together, subtracting one quantity fromanother, multiplying or dividing quantities,comparing two quantities, or converting a quantityfrom one unit to another.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 17/60
○ By using an enum, we can ensure that only validoperation types are used throughout the application,providing type safety and improving codereadability.○ The enum can be used in various parts of theapplication, such as in the QuantityDTO to specifythe type of operation being requested, in theQuantityMeasurementDTO to indicate the type ofoperation performed, and in the service layer todetermine the logic for handling different operationsbased on the specified operation type.
Step 6: Modify Spring Service Layer
Step 6A: Modify Service Interface
● The service interface IQuantityMeasurementServicepractically remains the same as before, only certain methodnames and signatures may be updated to better align withthe new repository methods. The service layer will stilldeclare methods for comparing quantities, converting units,performing arithmetic operations, and retrieving operationhistory, measurement types, and operation counts.
● However, the implementation of these methods will nowleverage the Spring Data JPA repository for data accessinstead of manual JDBC code. The service methods will bedesigned to handle the core functionality of quantitymeasurements while delegating persistence concerns to therepository layer.
● Here are the key changes in the service interface for UC17:
○ The method signatures may be updated to returnQuantityMeasurementDTO instead of raw values orbooleans, allowing for a more structured andconsistent API response format that can includeadditional information such as measurement types,operation type, result information, and error details ifneeded.○ New methods may be added to retrieve the historyof quantity measurement operations for a specificmeasurement type and to get the count of operationsfor a specific operation type, which will beimplemented using the new repository methods.
● Please refer to the Image snapshots of the updatedIQuantityMeasurementService.java file with service interfacedefinition.
Step 6A1: Attach image snapshot of theupdated IQuantityMeasurementService.java file with serviceinterface definition.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 18/60
UC17 Code Snippet 6A.1 IQuantityMeasurementService javaInterface
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 19/60
UC17 Code Snippet 6A.1 IQuantityMeasurementService javaInterface
Step 6B: Modify Service Implementation
● The service layer will be refactored to useSpring's @Service annotation and will leverage the newSpring Data JPA repository for data access. This involvesinjecting the repository into the service class and using it toperform database operations instead of manual JDBC code.The service methods will also be annotated with@Transactional where necessary to manage transactionsdeclaratively. The service layer will also handle any businesslogic related to quantity measurements, such ascomparisons, conversions, and arithmetic operations, whiledelegating data access to the repository layer.● The code in the QuantityMeasurementServiceImpl.java isvery similar to the previous UC16, only a couple of new APIis added with adherence to Spring conventions. Please findthe list of UC 17 Enhancements - Refactor Service Layer toUse Spring and Repository Pattern.
○ Refactored the service layer to useSpring's @Service annotation and leverage SpringData JPA repository for data access. This involvesinjecting the repository into the service class andusing it to perform database operations instead ofmanual JDBC code.
○ The service methods can also be annotatedwith @Transactional where necessary to managetransactions declaratively. We can use @Transactionalat the class level or it can be added to individualmethods if needed based on the specificrequirements of each operation. For example,methods that perform multiple database operationsor require rollback on exceptions can be annotatedwith @Transactional to ensure data integrity.
○ Here we do not use @Transactional at class ormethod level because we want to save the resultsand errors to the repository even if an exceptionoccurs during the operation, allowing for bettertracking and management of errors in the quantitymeasurement operations.
○ The service layer as usual handles any business logicrelated to quantity measurements, such ascomparisons, conversions, and arithmeticoperations, while delegating data persistence to therepository.
○ Used Spring's dependency injection to provide therepository instance to the service, allowing for easyswapping of repository implementations (e.g., cacheor database) without modifying the service logic.
○ Note there is no need for a Constructor as we areusing field injection with @Autowired for therepository, which is a common practice in Springapplications. However, constructor injection can alsobe used if preferred for better testability andimmutability.
○ Modified all the operation methods toreturn QuantityMeasurementDTO instead of rawvalues or booleans, allowing for a more structuredand consistent API response format that can includeadditional information such as measurement types,operation type, result information, and error details ifneeded.
○ Added a new API to retrieve the history of quantitymeasurement operations for a specific measurementtype and to get the count of operations for a specificoperation type.
○ The service implementation now interacts with therepository to save the results of operations for futureextensions such as audit or history purposes, and toretrieve historical data based on operation type andmeasurement type.
○ The service implementation also includes errorhandling to save error information to the repository
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 20/60
when exceptions occur during operations, allowingfor better tracking and management of errors in thequantity measurement operations.
● Please refer to the code snapshot below forQuantityMeasurementServiceImpl.java with Spring Servicelayer implementation using Spring Data JPA repository.Practically there is no change in code logic for comparison,conversion and arithmetic operations. Here are the onlychanges and the code snapshot is showing the sample forclarity.
○ The service now interacts with the repository to saveresults and errors.○ The new API was added to retrieve the history ofquantity measurement operations for a specificmeasurement type and to get the count of operationsfor a specific operation type.
○ The getQuantityModel() is refactoredto convertDtoToModel() method which is responsiblefor converting the QuantityDTO to aQuantityModel<IMeasurable>.
○ The service methods now usethe QuantityMeasurementDTO for output, which is aData Transfer Object (DTO) that encapsulates thedata needed for quantity measurement operationsand API communication, while the service layerhandles the conversion between the DTO and theentity for persistence.
○ Remove the main method from the serviceimplementation as it is no longer needed in a SpringBoot application. The application will be startedusing the QuantityMeasurementAppApplication classwith the main method that bootstraps the Spring Bootapplication.
Step 6B1: Attach image snapshot of theupdated QuantityMeasurementServiceImpl.java file with ModifyService Implementation.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 21/60
UC17 Code Snippet 6B.1 QuantityMeasurementServiceImpl javaInterface
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 22/60
UC17 Code Snippet 6B.2 QuantityMeasurementServiceImpl javaInterface
UC17 Code Snippet 6B.3 QuantityMeasurementServiceImpl javaInterface
Step 7: Modify REST Controllers
● UC 17 Enhancements:
○ Added@RestController and @RequestMapping annotationsto define this class as a REST controller and tospecify the base URL for the API endpoints.
○ Refactored the QuantityMeasurementApp class toexpose API methods in this controller class,changing method names from demonstrationXXX toperformXXX to better reflect their purpose as RESTAPI methods that perform specific operations onquantities.
○ Added PostMapping and GetMapping annotations tothe API methods to define the HTTP verbs andendpoints for each operation (e.g., /compare,/convert, /add).
○ All API methods accepts QuantityInputDTO as inputparameter which is a new DTO class created toencapsulate the input data for quantity measurementoperations, and returns QuantityMeasurementDTO asresponse which includes the result of the operationalong with additional information such asmeasurement types, operation type, and error detailsif any.
○ Added Swagger annotations (@Operation and @Tag)to the controller and its methods to enhance APIdocumentation and provide clear descriptions ofeach endpoint's functionality.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 23/60
○ Implemented error handling in the API methodsusing try-catch blocks to catch any exceptions thrownby the service layer, logging the errors, andreturning appropriate HTTP responses (e.g., badrequest) when errors occur.
○ Remove the main method from the controller class asit is no longer needed in a Spring Boot application.The application will be started using theQuantityMeasurementApplication class with the mainmethod that bootstraps the Spring Boot application.
● Following the above enhancements, the REST controller willnow be responsible for handling HTTP requests related toquantity measurements, delegating the business logic to theservice layer, and returning structured responses to theclients. The controller will also provide endpoints forretrieving operation history and counts, as well as errorhistory, allowing clients to access this information throughthe API. Please refer to the code snapshot below forthe QuantityMeasurementController.java class with RESTcontroller implementation using Spring MVC annotationsand Swagger documentation.
● Following Annotations are used in theQuantityMeasurementController.java class:
○ @RestController: This annotation indicates that theclass is a REST controller, which means it will handleHTTP requests and return responses in a RESTfulmanner. It is a combination of @Controller and@ResponseBody, allowing you to write RESTful webservices easily.
○ @RequestMapping("/api/v1/quantities"): Thisannotation specifies the base URL for all theendpoints in this controller. In this case, all endpointswill start with /api/v1/quantities, which helps toorganize the API and version it appropriately.
○ @Tag(name = "Quantity Measurements", description= "REST API for quantity measurement operations"):This Swagger annotation is used to group the APIendpoints under a common tag in the generated APIdocumentation. It provides a name and descriptionfor the group of endpoints related to quantitymeasurements, making it easier for developers tounderstand the purpose of the API and navigate thedocumentation.
○ @PostMapping and @GetMapping: Theseannotations are used to map HTTPPOST andGET requests to specific handler methods in thecontroller. Forexample, @PostMapping("/compare") mapsPOST requests to the /compare endpoint to thecompareQuantities method, while@GetMapping("/history/{operation}") mapsGET requests to the /history/{operation} endpoint tothe getOperationHistory method.
○ @Operation(summary = "Compare twoquantities"): This Swagger annotation is used toprovide a summary description for the API endpointin the generated documentation. It helps developersunderstand the purpose of the endpoint at a glancewhen they are browsing the API documentation,improving the overall developer experience.
Step 7A: Attach image snapshot for `QuantityInputDTO.java`class which is a new DTO class created to encapsulate theinput data for quantity measurement operations.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 24/60
UC17 Code Snippet 7A.1 QuantityMeasurementController javaClass
Step 7B: Attach image snapshot forQuantityMeasurementController.java class with REST controllerimplementation using Spring MVC annotations and Swaggerdocumentation.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 25/60
UC17 Code Snippet 7B.1 QuantityMeasurementController javaClass
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 26/60
UC17 Code Snippet 7B.2 QuantityMeasurementController javaClass
UC17 Code Snippet 7B.2 QuantityMeasurementController javaClass
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 27/60
UC17 Code Snippet 7B.3 QuantityMeasurementController javaClass
Step 8: Configure Application Properties
Step 8A: application.properties (Development)
● Please find the application.properties file for developmentenvironment configuration.
○ This file includes configurations for the Spring Bootapplication, JPA settings for H2 database, H2console settings, connection pool settings, logginglevels, Swagger/OpenAPI settings, and Actuatorsettings for monitoring and management.
○ The development configuration uses an in-memoryH2 database for ease of development and testing,with the H2 console enabled for easy access to thedatabase during development.
○ The logging levels are set to DEBUG for theapplication package and Spring web and HibernateSQL to provide detailed logs during development.
○ Swagger/OpenAPI is enabled for APIdocumentation, and Actuator endpoints are exposedfor health checks and metrics.
● Please refer to the link for the content of theapplication.properties file for development environmentconfiguration.
● Here is also the image of application.properties file fordevelopment environment configuration:
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 28/60
Step 8B: application-prod.properties (Production)
● Please find the application-prod.properties file contentbelow for production environment configuration. This isspecified here for completeness, but in a real application,you would typically have this file in your project and nothardcode it in the documentation. The productionconfiguration uses a MySQL database for persistence, withappropriate JPA settings for MySQL. The logging levels areset to WARN for the root logger and INFO for theapplication package to reduce log verbosity in production.Actuator endpoints are exposed for health checks andmetrics, but sensitive information is not included in thehealth details to avoid exposing sensitive information inproduction environments.
● Please refer to the snapshot below of the application-prod.properties file for production environmentconfiguration.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 29/60
Step 9: Add Security Configuration
● For simplicity, we will not implement security in this UC, butin a real application, you would typically add securityconfigurations using Spring Security to protect your APIendpoints. This could include authentication andauthorization mechanisms such as JWT tokens, OAuth2, orbasic authentication depending on your requirements.
● Since we have added the Spring Security dependency toour project, we can create a security configuration class todefine the security settings for our application. This classwould typically extend WebSecurityConfigurerAdapter andoverride methods to configure HTTP security, authenticationproviders, and other security-related settings.
● Even though we are not implementing actual security in thisUC, we can create a basic security configuration that allowsall requests for the sake of development and testing. Thiswill allow us to focus on the functionality of the quantitymeasurement application without being blocked by securityconfigurations during development. Please create a configdirectory in your project structure to hold the securityconfiguration class.
Step 9A: Please refer to the code snapshot below for theSecurityConfig.java class with basic security configuration thatallows all requests.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 30/60
UC17 Code Snippet 9A.1 SecurityConfig java Class
UC17 Code Snippet 9A.2 SecurityConfig java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 31/60
UC17 Code Snippet 9A.3 SecurityConfig java Class
Step 10: Add Spring Boot Application Class
● Create or update `QuantityMeasurementApplication.java`:
Step 11: Build and Run Spring Boot Application
● Please find the application.properties file content below fordevelopment environment configuration.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 32/60
Step 12: Test REST Endpoints
● Test via curl:
CURL commands to test the REST endpoints for comparingquantities, adding quantities, retrieving operation history, andgetting operation counts. These commands will sendHTTP requests to the API endpoints defined in the`QuantityMeasurementController` and will allow you to verify thatthe endpoints are functioning correctly and returning the expectedresults based on different input scenarios. The commands alsoinclude error handling scenarios to verify that the controllerproperly handles exceptions and returns appropriate HTTPresponses when errors occur.
1. CURL Call to Compare Quantities
A. API POST Call
# API POST Call Compare quantitiescurl -X POST http://localhost:8080/api/v1/quantities/compare \ -H "Content-Type: application/json" \ -d '{   "thisQuantityDTO": {"value": 1.0,"unit": "FEET","measurementType":"LengthUnit"},   "thatQuantityDTO": {"value": 12.0,"unit": "INCHES", "measurementType":"LengthUnit"} }'
# Result Compare quantities{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":12.0,"thatUnit":"INCH 
B. API GET Call
# API GET Call Compare quantitiescurlhttp://localhost:8080/api/v1/quantities/history/operation/COMPARE
# Result of API GET Call Compare quantities[{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":12.0,"thatUnit":"INC
2. CURL Call to Convert Quantities
A. API Call
# API POST Call Convert quantitiescurl -X POST http://localhost:8080/api/v1/quantities/convert \ -H "Content-Type: application/json" \ -d '{   "thisQuantityDTO": {"value": 1.0,"unit": "FEET", "measurementType":"LengthUnit"},   "thatQuantityDTO": {"value": 0.0,"unit": "INCHES", "measurementType":"LengthUnit"} }'
# Result of API POST Call Convert quantities{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":0.0,"thatUnit":"INCHE
B. API GET Call
# API GET Call Convert quantitiescurlhttp://localhost:8080/api/v1/quantities/history/operation/CONVERT
# Result of API GET Call Compare quantities[{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":0.0,"thatUnit":"INCH
3. CURL Call to Add Quantities
B. API Call
# API POST call for Add quantitiescurl -X POST http://localhost:8080/api/v1/quantities/add \  -H "Content-Type: application/json" \  -d '{    "thisQuantityDTO": {"value": 1.0,"unit": "FEET", "measurementType":"LengthUnit"},    "thatQuantityDTO": {"value": 12.0,"unit": "INCHES", "measurementType":"LengthUnit"}  }'
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 33/60
# Result of API POST Call Convert quantities{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":12.0,"thatUnit":"INCH
C. API GET Call
# API GET Call for Add quantitiescurlhttp://localhost:8080/api/v1/quantities/history/operation/ADD
# Result of API GET Call Compare quantities[{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":12.0,"thatUnit":"INC
4. CURL Call to Get by type and count
A. Get measurements by type
# API GET measurements by type callcurlhttp://localhost:8080/api/v1/quantities/history/type/LengthUnit
# Result of API GET Call Compare quantities[{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":12.0,"thatUnit":"INC{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":0.0,"thatUnit":"INCHE{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":12.0,"thatUnit":"INCH
B. Get Operation Count
# API GET Count by Operationscurl http://localhost:8080/api/v1/quantities/count/COMPARE
5. Access H2 Console:
You can access the H2 console to view the in-memory databaseand verify that the quantity measurement data is being storedcorrectly. The H2 console is available at`http://localhost:8080/h2-console`. Use the followingcredentials to log in:- JDBC URL: `jdbc:h2:mem:quantitymeasurementdb`- Username: `sa`    - Password: (leave blank)
# Open H2 ConsoleOpen http://localhost:8080/h2-console
UC17  12.1 H2 Console
6. API Error Call
A. API Post Call with Error
# API POST Call wit JSON Body Errorcurl -X POST http://localhost:8080/api/v1/quantities/add \ -H "Content-Type: application/json" \ -d '{   "thisQuantityDTO": {"value": 1.0,"unit": "FOOT", "measurementType":"LengthUnit"},   "thatQuantityDTO": {"value": 12.0,"unit": "INCHE", "measurementType":"LengthUnit"} }'
On running the above curl command you will see the following:a. The response for the above command should return a badrequest with error details in the response body due toinvalid unit names "FOOT" and "INCHE" which do notmatch the expected unit names defined in the application.b. This will allow us to verify that the controller properlyhandles exceptions and returns appropriate HTTP responseswhen errors occur.c. What we expect in the response is a 400 Bad Requeststatus code along with a response body that contains detailsabout the error.d. But the error we see is huge stack trace in the console anda generic error response in the client which is not ideal.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 34/60
e. This is because we have not implemented global exceptionhandling in our application yet, which will be covered in thenext step.f. Once we implement global exception handling, we will beable to return more informative and structured errorresponses to the clients when exceptions occur, improvingthe overall user experience and making it easier for clientsto understand what went wrong with their requests.g. With global exception handling implemented, the expectedresponse for the above command would be something likethis:
HTTP/1.1 400 Bad RequestContent-Type: application/json{   "timestamp": "2024-06-01T12:34:56.789Z",   "status": 400,   "error": "Bad Request",   "message": "Invalid unit name: FOOT.",   "path": "/api/v1/quantities/add" }
h. Please find the image snapshot below of the current errorresponse in the client and the stack trace in the consolewhen we send the above command without globalexception handling implemented.
Step 13: Exception Handling with REST Controllers
● In a Spring Boot application, you can implement globalexception handling for your REST controllers using the@ControllerAdvice annotation. This allows you to centralizeyour exception handling logic and return consistent errorresponses to the clients when exceptions occur in your APIendpoints. Below is an example of how to implement aglobal exception handler for theQuantityMeasurementController using @ControllerAdviceand @ExceptionHandler annotations.
● First, Create a new class `GlobalExceptionHandler.java` inthe `com.app.quantitymeasurement.exception` package tohandle exceptions globally for the REST controllers.
● GlobalExceptionHandler is a centralized exception handlingclass for the Quantity Measurement application. It usesSpring's @ControllerAdvice annotation to interceptexceptions thrown by any controller and provides customresponses for specific exceptions likeQuantityMeasurementException as well as a generic handlerfor all other exceptions. The class defines three mainmethods:
○ handleMethodArgumentNotValidException: Handlesvalidation errors that occur when the input data failsto meet the specified constraints. It extracts the errormessages from the exception and constructs astructured error response with details about thevalidation failure.
○ handleQuantityException: Handles exceptions of typeQuantityMeasurementException and returns astructured error response with details about the
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 35/60
error, including a timestamp, HTTP status code, errortype, message, and the request path that caused theerror.
○ handleGlobalException: A catch-all handler for anyother exceptions that may occur, providing a similarstructured error response but with a generic"Internal Server Error" message.
● All the error responses follow a consistent structure,ensuring that clients receive clear and actionable feedbackwhen errors occur. This approach ensures that clientsreceive consistent and informative error messages,improving the overall robustness and user experience of theAPI.
● The use of @ControllerAdvice allows for separation of errorhandling logic from the controller code, making theapplication more maintainable and improving the overalluser experience by providing informative error messages inthe API responses.
● Following are the key components of the global exceptionhandling implementation:
○ @ControllerAdvice: This annotation is used toindicate that the class will handle exceptions globallyacross all controllers in the application. It allows youto define methods that will be invoked when specificexceptions are thrown from any controller.
○ @ExceptionHandler: This annotation is used tospecify the type of exception that a particular methodwill handle. For example, you can define a method tohandle QuantityMeasurementException and anothermethod to handle generic Exception types.
○ ResponseEntity: This is a Spring class that representsan HTTP response, including the status code,headers, and body. In the exception handlermethods, you can return a ResponseEntity with acustom error response body and an appropriateHTTP status code to indicate the nature of the error.
Step 13A: Please refer to the image snapshot below for the`GlobalExceptionHandler.java` class with global exceptionhandling implementation for the REST controllers.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 36/60
UC17 Code Snippet 13A.1 GlobalExceptionHandler java Class
UC17 Code Snippet 13A.2 GlobalExceptionHandler java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 37/60
UC17 Code Snippet 13A.3 GlobalExceptionHandler java Class
Step 13B: Build and Run Spring Boot Application
# Clean and compilemvn clean compile
# Run the applicationmvn spring-boot:run
Step 13C: Test via curl:
1. API Error Call - Input Validation Exception
# Error scenario - Invalid unit comparisoncurl -X POST http://localhost:8080/api/v1/quantities/compare \ -H "Content-Type: application/json" \ -d '{   "thisQuantityDTO": {"value": 1.0, "unit": "FEET","measurementType": "LengthUnit"},   "thatQuantityDTO": {"value": 12.0, "unit":   "INCHE", "measurementType":"LengthUnit"} }'
# Result{"timestamp":"2026-03-09T06:35:31.236596","status":400,"error":"Quantity MeasurementError","message":"Unit must be valid for the specifiedmeasurement type","path":"quantityInputDTO"}
2. API Error Call - Quantity Measurement Exception
# Error scenario - Adding incompatible measurement typescurl -X POST http://localhost:8080/api/v1/quantities/add \ -H "Content-Type: application/json" \ -d '{
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 38/60
   "thisQuantityDTO": {"value": 1.0, "unit": "FEET","measurementType": "LengthUnit"},   "thatQuantityDTO": {"value": 1.0,   "unit": "KILOGRAM", "measurementType":"WeightUnit"} }'
# Result{"timestamp":"2026-03-09T06:38:49.953048","status":400,"error":"Quantity MeasurementError","message":"add Error: Cannot perform arithmetic betweendifferent measurement categories: LengthUnit andWeightUnit","path":"/api/v1/quantities/add"}
3. API Error Call - System Exception
# Error scenario - Division by zerocurl -X POST http://localhost:8080/api/v1/quantities/divide \  -H "Content-Type: application/json" \  -d '{    "thisQuantityDTO": {"value": 1.0,    "unit": "FEET", "measurementType":"LengthUnit"},    "thatQuantityDTO": {"value": 0.0,    "unit": "INCHES", "measurementType":"LengthUnit"}  }'
# Result{"timestamp":"2026-03-09T06:43:24.938125","status":500,"error":"Internal ServerError","message":"Divide byzero","path":"/api/v1/quantities/divide"}
4. API Call - Get Quantity Measurement Error History
# Get error historycurl http://localhost:8080/api/v1/quantities/history/errored
# Result[{"thisValue":1.0,"thisUnit":"FEET","thisMeasurementType":"LengthUnit","thatValue":1.0,"thatUnit":"KILOGRAMperform arithmetic between different measurement categories:LengthUnit and WeightUnit","error":true}]
Step 14: Test REST Controller with Mockito
● Create REST Tests for the REST controller using Spring'sMockMvc to test the API endpoints. This will involve writingunit tests for the QuantityMeasurementController class,mocking the service layer to isolate the controller logic, andverifying that the API endpoints return the expectedresponses based on different input scenarios.
● Please refer to the image snapshot below for theQuantityMeasurementControllerTest.java class with RESTcontroller tests using Spring's MockMvc.
● The tests will cover scenarios for comparing quantities,adding quantities, retrieving operation history, and gettingoperation counts, ensuring that the API endpoints arefunctioning correctly and returning the expected results.
● The tests will also include error handling scenarios to verifythat the controller properly handles exceptions and returnsappropriate HTTP responses when errors occur.
● Following are the Mockito Concepts used in theQuantityMeasurementControllerTest.java class:
○ @MockBean: This annotation is used to create amock instance of the IQuantityMeasurementServiceand inject it into the Spring application context. Thisallows us to mock the behavior of the service layerwhen testing the controller, isolating the controllerlogic and ensuring that we are only testing thecontroller's behavior without relying on the actualservice implementation.
○ Mockito.when(): This method is used to define thebehavior of the mocked service methods. Forexample, we can specify that when thecompareQuantities method is called with specificinput parameters, it should return a predefinedresult. This allows us to control the behavior of the
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 39/60
service layer during testing and simulate differentscenarios without needing to rely on the actualservice implementation or database interactions.
○ Mockito.verify(): This method can be used to verifythat certain methods on the mocked service werecalled with specific parameters during the testexecution. This helps to ensure that the controller isinteracting with the service layer as expected andthat the correct methods are being invoked based onthe API requests.
● Following Annotations are used in theQuantityMeasurementControllerTest.java class:
○ @WebMvcTest(QuantityMeasurementController.class):This annotation is used to indicate that the test classis a Spring MVC test for theQuantityMeasurementController. It sets up the Springapplication context with only the web layercomponents needed for testing the controller,allowing for focused testing of the controller'sbehavior without starting the entire applicationcontext.
○ @MockBean: This annotation is used to create amock instance of theIQuantityMeasurementService and inject it into theSpring application context. This allows us to mockthe behavior of the service layer when testing thecontroller, isolating the controller logic and ensuringthat we are only testing the controller's behaviorwithout relying on the actual service implementation.
○ @Autowired: This annotation is used to inject theMockMvc instance into the test class, allowing us toperform HTTP requests and assertions on theresponses when testing the controller endpoints. It isalso used to inject the ObjectMapper for convertingobjects to JSON and vice versa in the tests.
Step 14A: Please refer to the Image snapshot below for theQuantityMeasurementControllerTest.java class with RESTcontroller tests using Spring's MockMvc.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 40/60
UC17 Code Snippet 14A.1QuantityMeasurementControllerTest java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 41/60
UC17 Code Snippet 14A.2QuantityMeasurementControllerTest java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 42/60
UC17 Code Snippet 14A.3QuantityMeasurementControllerTest java Class
Step 14B: Step 14B: Run the tests for`QuantityMeasurementControllerTest`
# Run the tests forQuantityMeasurementControllerTestmvn test -Dtest=QuantityMeasurementControllerTest
Step 15: Quantity Measurement Application Integration Testswith Spring Boot
● Write integration tests for the Quantity Measurementapplication using Spring Boot's testing support. These testswill involve starting the application context and testing theAPI endpoints with real HTTP requests to ensure that theentire application stack is working correctly together. Theintegration tests will cover scenarios for comparingquantities, adding quantities, retrieving operation history,and getting operation counts, as well as error handlingscenarios to verify that the application behaves as expectedin a real environment.
● We create a test class annotated with @SpringBootTest toindicate that it is an integration test that will start the entireapplication context. We can use Spring's TestRestTemplateor MockMvc to perform HTTP requests to the API endpointsand assert the responses. The tests will cover bothsuccessful scenarios and error scenarios to ensure that theapplication is robust and handles different cases correctly.
● We use the Test Class created by Sprint Initializr with thename QuantityMeasurementApplicationTests for writing ourintegration tests.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 43/60
● Following are the key components of the integration testingimplementation:
○ @SpringBootTest: This annotation is used to indicatethat the test class is a Spring Boot test that will startthe entire application context. This allows you to testthe application integration, ensuring that allcomponents are working together as expected.
○ TestRestTemplate or MockMvc: These are Springtesting utilities that allow you to perform HTTPrequests to the API endpoints and assert theresponses. TestRestTemplate is typically used for fullintegration tests that start the server, while MockMvccan be used for more focused tests that do notrequire starting the server. Here we can useTestRestTemplate for true integration testing of theREST endpoints.
○ Test methods: Each test method will perform specificAPI calls to the endpoints (e.g., compare, add,history) and assert the responses to ensure that theapplication is behaving as expected. This includesasserting the HTTP status codes, response bodycontent, and any error messages for negative testcases.
○ Error handling scenarios: The tests will also includescenarios where invalid input is provided to the APIendpoints, ensuring that the application returnsappropriate error responses and handles exceptionscorrectly.
○ We need to know the following concepts toimplement integration tests for the QuantityMeasurement application using Spring Boot:
■ Spring Boot Testing Annotations(@SpringBootTest, @Test, etc.)■ TestRestTemplate for performingHTTP requests in tests■ Assertions for validating responses (e.g.,assertEquals, assertNotNull, etc.)■ Mocking dependencies if needed (though fortrue integration tests, we typically do notmock and test with real components)■ Handling of application context and testconfiguration for integration tests.
○ The integration tests will ensure that the entireapplication stack is working correctly together,including the REST controllers, service layer,repository layer, and any other components involvedin the quantity measurement operations.
○ The tests will also help to identify any issues or bugsin the application when all components areintegrated, providing confidence that the applicationis functioning as expected in a real environment.
○ The integration tests will be run as part of the buildprocess in CI/CD pipelines, ensuring that anychanges to the codebase do not break existingfunctionality and that the application continues towork correctly as new features are added or changesare made.
○ The integration tests will also serve as documentationfor the expected behavior of the API endpoints,providing examples of how to interact with the APIand what responses to expect for different scenarios.
○ You can run the integration tests using Maven withthe following command:
# Run the tests forQuantityMeasurementApplicationTestsmvn test -Dtest=QuantityMeasurementControllerTest
○ You can also see the test results in the console outputor in the generated test reports (e.g., surefire-reports) to verify that all tests have passedsuccessfully. If any tests fail, you can investigate thefailure details to identify and fix any issues in theapplication.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 44/60
○ To view the test reports, you can navigate to thetarget/surefire-reports directory in your project afterrunning the tests, where you will find HTML and XMLreports that provide detailed information about thetest execution and results. These reports will showwhich tests passed, which tests failed, and any errormessages or stack traces for failed tests, helping youto quickly identify and address any issues in theapplication.
Step 15A: Please refer to the Image snapshot below for theQuantityMeasurementApplicationTests.java class with integrationtests for the Quantity Measurement application using SpringBoot's testing support.
UC17 Code Snippet 15A.1QuantityMeasurementControllerTest java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 45/60
UC17 Code Snippet 15A.2QuantityMeasurementControllerTest java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 46/60
UC17 Code Snippet 15A.3QuantityMeasurementControllerTest java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 47/60
UC17 Code Snippet 15A.4QuantityMeasurementControllerTest java Class
UC17 Code Snippet 15A.5QuantityMeasurementControllerTest java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 48/60
UC17 Code Snippet 15A.6QuantityMeasurementControllerTest java Class
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 49/60
UC17 Code Snippet 15A.7QuantityMeasurementControllerTest java Class
UC17 Code Snippet 15A.8QuantityMeasurementControllerTest java Class
Step 15B: Build Test, Package and Run Spring BootApplication
# Clean and compilemvn clean compile
# Run testsmvn test
# Alternatively Run the tests forQuantityMeasurementApplicationTestsmvn test -Dtest=QuantityMeasurementApplicationTests
# Or package as JAR and runmvn clean packagejava -jar target/quantity-measurement-app-1.0.0.jar
Step 16: Generate Rich Test Reports
Step 16A: Generate Rich Test Reports with Maven SurefireReport Plugin
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 50/60
● To generate rich test reports with the Maven Surefire ReportPlugin, you can add the following configuration to yourpom.xml file. This plugin will create detailed HTML reportsfor your test executions, making it easier to analyze testresults and identify any issues.
<!-- Add the following plugin configuration toyour pom.xml to generate test reports --><build>   <plugins>       <plugin>          <groupId>org.apache.maven.plugins</groupId>           <artifactId>maven-surefire-report-plugin</artifactId>           <version>3.2.5</version>       </plugin>   </plugins></build>  
Step 16B: View the Generated Test Reports
● After adding the plugin configuration, you can run thefollowing command to generate the test reports:
# Open the test report in a web browsermvn surefire-report:reportopen target/site/surefire-report.html
Step 16C: Test Report Features
● The generated test report will include a summary of the testexecution, showing the total number of tests run, thenumber of tests that passed, failed, or were skipped.● Each test case will have its own section in the report,showing the test name, status (pass/fail), and any errormessages or stack traces for failed tests.● The report will also include links to the source code foreach test case, allowing you to quickly navigate to the testmethod in your codebase for further investigation ifneeded.● The test report will be organized in a clear and structuredmanner, making it easy to analyze the results and identifyany patterns or common issues across multiple test cases.● You can use the test report to track the health of yourapplication over time, especially as you make changes tothe codebase and add new features, ensuring that your testscontinue to pass and that your application remains stableand reliable
Please refer to the image snapshot below for an example of agenerated test report using the Maven Surefire Report Plugin,showing the summary of test execution and details for individualtest cases.
UC17 Code Snippet 16C.1 Maven Surefire Report Plugin
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 51/60
UC17 Code Snippet 16C.2 Maven Surefire Report Plugin
Step 17: Rich API Documentation with Swagger/OpenAPI
● Swagger UI is used to test the API endpoints directly fromthe documentation interface. You can fill in the requiredparameters and request body, and then execute the requestto see the response from the server, making it a convenienttool for both documentation and testing of your API.
● Implementing Swagger/OpenAPI documentation in yourSpring Boot application provides several benefits:
○ Interactive API Documentation: Swagger UIprovides an interactive interface for exploring andtesting your API endpoints, making it easier fordevelopers to understand how to use the API andwhat responses to expect.
○ Auto-Generated Documentation: By usingannotations like @Operation and @Tag, you canautomatically generate comprehensive APIdocumentation without needing to write separatedocumentation manually.
○ Improved Developer Experience: The interactivenature of Swagger UI allows developers to quicklytest API endpoints and see real-time responses,improving the overall developer experience andmaking it easier to debug and understand the APIbehavior.
○ Standardized API Specification: Swagger/OpenAPIprovides a standardized way to describe your API,making it easier for other developers and tools tounderstand and integrate with your API. This can beespecially beneficial when working with third-partydevelopers or when providing API documentationfor external use.
Step 17A: Access Swagger UI for API Documentation
● After starting the Spring Boot application, you can accessthe Swagger UI for API documentation at the following URL:
# Open Swagger API in Browseropen http://localhost:8080/swagger-ui.html
Step 17B: Explore API Endpoints in Swagger UI
● After starting the Spring Boot application, you can accessthe Swagger UI for API documentation at the following URL:
● In the Swagger UI, you will see a list of all the APIendpoints defined in your QuantityMeasurementController,along with their HTTP methods (e.g., POST, GET) and
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 52/60
descriptions provided by the @Operation annotations. Youcan click on each endpoint to expand it and see moredetails, including the expected request body, responsebody, and any parameters required for the endpoint.
● Important Swagger Concepts used in the APIdocumentation:
○ @OpenAPIDefinition: This annotation is used toprovide metadata about the API, such as the title,version, and description. It helps to give an overviewof the API and its purpose in the generateddocumentation.
○ @Operation: This annotation is used to provide asummary and description for each API endpoint. Ithelps to explain what the endpoint does and whatkind of operations it performs, making it easier fordevelopers to understand the functionality of eachendpoint when they are browsing the APIdocumentation.
○ @Tag: This annotation is used to group related APIendpoints together under a common tag in thegenerated documentation. It helps to organize theAPI documentation and makes it easier fordevelopers to navigate through the endpoints basedon their functionality or category.
○ @RequestBody: This annotation is used in thecontroller methods to indicate that the methodparameter should be bound to the body of the HTTPrequest. In Swagger UI, this will show the expectedstructure of the request body for endpoints thatrequire input data, allowing developers tounderstand what data they need to provide whenmaking requests to those endpoints.
○ @ResponseBody: This annotation is used to indicatethat the return value of a controller method shouldbe serialized to the body of the HTTP response. InSwagger UI, this will show the expected structure ofthe response body for each endpoint, allowingdevelopers to understand what kind of data they canexpect to receive when they make requests to thoseendpoints.
○ @Content: This annotation is used to specify thecontent type of the request and response bodies forAPI endpoints. In Swagger UI, this will indicate theexpected format of the data being sent and received(e.g., application/json), helping developers tounderstand how to format their requests and whatkind of responses to expect from the API endpoints.
○ @ExampleObject: This annotation is used to provideexample values for the request and response bodiesin the API documentation. In Swagger UI, this willshow sample data for the request and response,giving developers a clear example of how tostructure their requests and what kind of responsesthey can expect from the API endpoints.
○ @Schema: This annotation is used to define theschema for the request and response bodies in theAPI documentation. It allows you to specify thestructure of the data, including the fields, their types,and any constraints or validations. In Swagger UI,this will provide a clear representation of theexpected data format for both requests andresponses, making it easier for developers tounderstand how to interact with the API endpointscorrectly.
○ @Parameter: This annotation is used to provideadditional information about the parameters of anAPI endpoint, such as their name, description, andwhether they are required. In Swagger UI, this willhelp to clarify the purpose of each parameter andhow it should be used when making requests to theAPI endpoints.
○ @ApiResponse: This annotation is used to documentthe possible responses for an API endpoint,including the HTTP status codes and the structure ofthe response body for each status code. In SwaggerUI, this will show the different responses that an
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 53/60
endpoint can return, helping developers tounderstand how the API handles different scenariosand what kind of responses they can expect basedon the outcome of their requests.
Step 17C: Test API Endpoints from Swagger UI
● Important Concepts to Explore in Swagger UI:
○ Endpoint Details: Each endpoint will show the HTTPmethod, URL path, and a description of what theendpoint does based on the @Operation annotationin the controller.
○ Request Body: For endpoints that require a requestbody (e.g., POST endpoints), Swagger UI will showthe expected structure of the request body based onthe DTO classes used in the controller methods.
○ Response Body: Swagger UI will also show theexpected structure of the response body based onthe return types of the controller methods, allowingyou to understand what data will be returned by theAPI endpoints.
○ Try It Out: Swagger UI provides a "Try it out" featurethat allows you to interact with the API directly fromthe documentation. You can fill in the requiredparameters and request body, execute the request,and see the response from the server in real-time,making it a convenient tool for both documentationand testing of your API.
○ Error Responses: If you have defined error handlingin your controller, Swagger UI will also show thepossible error responses for each endpoint, allowingyou to understand how the API handles differenterror scenarios.
○ API Versioning: If you have versioned your API(e.g., using /api/v1/quantities), Swagger UI willreflect this in the documentation, making it clearwhich version of the API is being documented andtested.
Step 17D: Please refer to the image snapshot below of theSwagger UI interface
You will see the API documentation for the Quantity Measurementapplication, including the list of endpoints, request and responsestructures, and the "Try it out" feature for testing the API directly fromthe documentation.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 54/60
UC17 Code Snippet 17D.1 Swagger UI Interface
UC17 Code Snippet 17D.2 Swagger UI API Call
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 55/60
UC17 Code Snippet 17D.3 Swagger UI API Call
Postconditions
● Spring Boot application fully functional with embeddedTomcat server.● REST endpoints accessible athttp://localhost:8080/api/v1/quantities/*.● JPA entities automatically mapped to database tables.● H2 console accessible for development athttp://localhost:8080/h2-console.● Swagger UI documentation accessible athttp://localhost:8080/swagger-ui.html.● All UC1–UC16 business logic preserved with identicalresults.● Dependency injection managed by Spring container.● Transactional support provided by Spring's @Transactional.● RESTful API returns JSON with appropriate HTTP statuscodes.● Exception handling centralized through @ControllerAdvice.● Actuator endpoints available for monitoring and healthchecks.● Maven can build, test, and run the application seamlessly.● Integration with Spring Security ready forauthentication/authorization.● Tests use @WebMvcTest and MockMvc for REST endpointtesting.
Concepts Learned by Implementing UC17:
1. Spring Boot Auto-Configuration
● Automatic bean registration based on classpathdependencies.● Override with application.properties orapplication.yml.● Embedded server eliminates deployment complexity.
2. Dependency Injection with Spring
● @Autowired injects dependencies automatically.● @Service, @Repository, @Controller stereotypeannotations register beans.● Constructor injection preferred over field injection.
3. Spring Data JPA
● Extends JpaRepository for automatic CRUD methods.● Query methods generated from method names.● @Query for custom JPQL or native SQL queries.● Automatic pagination and sorting.
4. REST Controllers with Spring
● @RestController + @RequestMapping define RESTendpoints.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 56/60
● HTTP methods mappedvia @GetMapping,@PostMapping, etc.● Path variables and request parameters extractedautomatically.● Return types serialized to JSON automatically.
5. Spring's Transactional Management
● @Transactional handles transaction demarcation.● Declarative transaction management simplifies code.● Automatic rollback on exception.● Supports propagation levels and isolation levels.
6. Spring Security Basics
● @EnableWebSecurity activates security.● Role-based access control through @PreAuthorize.● JWT token support for stateless authentication.● CORS configuration for cross-origin requests.
7. Exception Handling in REST
● @ExceptionHandler methods handle specificexceptions.● @ControllerAdvice centralizes exception handling.● Consistent error response format.● Appropriate HTTP status codes for error types.
8. Content Negotiation
● Spring negotiates content type from Accept header.● Jackson automatically serializes/deserializes JSON.● XML support with proper configuration.
9. API Documentation with Swagger
● @OpenAPIDefinition defines API metadata.● @Operation documents endpoint behavior.● @Tag groups related endpoints.● Auto-generated OpenAPI specification.
10.Profiles and Environment Configuration
● application-{profile}.properties for environment-specific settings.● @Profile beans for profile-specific configurations.● spring.profiles.active to activate profile.
11.Spring Boot Actuator
● /actuator/health for application health.● /actuator/metrics for performance metrics.● /actuator/info for application information.● Extensible with custom endpoints.
12.MockMvc for REST Testing
● @WebMvcTest for controller layer testing.● perform() executes HTTP requests.● andExpect() asserts response characteristics.● Avoids starting full application context.
Key Concepts Tested:
1. Spring Boot Application Context
● Application starts successfully.● The embedded Tomcat server runs on port 8080.● Beans registered correctly via component scanning.
2. JPA Entity Mapping
● Entities persisted to the H2 database.● Auto-generated primary keys work.● Timestamps updated on create/update.
3. Spring Data JPA Repository
● findByOperation() returns correct records.● Custom @Query methods execute properly.● Pagination works with Pageable parameters.
4. Transactional Operations
● Operations rollback on exception.● Multiple repository calls within the same transactionwork.
5. REST Endpoint Functionality
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 57/60
● POST requests accepted with JSON bodies.● GET requests with path variables work.● Response status codes correct (200, 400, etc.).
6. Content Negotiation
● POST with Content-Type: application/json works.● Response Content-Type: application/json setcorrectly.
7. Exception Handling
● Invalid input returns 400 Bad Requests.● Internal errors return 500 Internal Server Error.● Error responses include meaningful messages.
8. API Documentation
● Swagger UI loads without errors.● Endpoints appear in documentation.● Request/response schemas shown correctly.
9. H2 Console
● Database console accessible.● Tables visible in the console.● SQL queries executable in console.
10.Actuator Endpoints
● /actuator/health returns UP.● /actuator/metrics shows application metrics.● Endpoints secured with Spring Security.
11.MockMvc Testing
● @WebMvcTest creates minimal context.● Mocked service used in tests.● Response assertions work correctly.
12.Backward Compatibility
● All UC1–UC16 business logic produces identicalresults.● Same test cases pass with Spring Boot version.● No changes needed in business logic.
Test Case Examples:
1. testSpringBootApplicationStarts()
● Verifies application context loads successfully.● Checks embedded server starts on port 8080.
2. testRestEndpointCompareQuantities()
● POST to /api/v1/quantities/compare.● Verifies response status 200.● Verifies response contains comparison result.
3. testRestEndpointConvertQuantities()
● POST to /api/v1/quantities/convert with queryparam.● Verifies converted value correct.
4. testRestEndpointAddQuantities()
● POST to /api/v1/quantities/add with target unit.● Verifies sum calculated correctly.
5. testRestEndpointInvalidInput_Returns400()
● POST with invalid JSON body.● Verifies response status 400.
6. testRestEndpointMissingParameter_Returns400()
● GET without required path parameters.● Verifies response status 400.
7. testSwaggerUILoads()
● GET /swagger-ui.html.● Verifies response status 200.● Verifies HTML content returned.
8. testOpenAPIDocumentation()
● GET /api-docs.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 58/60
● Verifies OpenAPI schema returned.● Verifies all endpoints documented.
9. testH2ConsoleLaunches()
● GET /h2-console.● Verifies console page loads.
10.testH2DatabasePersistence()
● Save entity via JPA.● Query database directly.● Verifies data persisted.
11.testActuatorHealthEndpoint()
● GET /actuator/health.● Verifies response contains status UP.
12.testActuatorMetricsEndpoint()
● GET /actuator/metrics.● Verifies metrics available.
13.testJPARepositoryFindByOperation()
● Save entities with different operations.● Call findByOperation().● Verifies correct entities returned.
14.testJPARepositoryCustomQuery()
● Save entities with error flag.● Call custom @Query method.● Verifies correct entities returned.
15.testTransactionalRollback()
● Save entity.● Throw exceptions during transactions.● Verify entity not persisted.
16.testContentNegotiation_JSON()
● POST with Content-Type: application/json.● Verify response Content-Type: application/json.
17.testContentNegotiation_XML()
● POST with Accept: application/xml.● Verify response in XML format (if configured).
18.testExceptionHandling_GlobalHandler()
● Throw an exception in the controller.● Verify @ControllerAdvice handles it.● Verify error response format.
19.testRequestPathVariable_Extraction()
● GET /api/v1/quantities/count/COMPARE.● Verify path variable COMPARE extracted correctly.
20.testRequestQueryParameter_Extraction()
● GET with ?targetUnit=FEET.● Verify query parameter extracted correctly.
21.testResponseSerialization_Object()
● Return object from controller.● Verify automatically serialized to JSON.
22.testMockMvc_ComparisonTest()
● Use MockMvc to test comparison endpoints.● Mock service layer.● Verify response without starting full context.
23.testMockMvc_ResponseAssertion()
● Perform request via MockMvc.● Use andExpect() for assertions.● Verify status, content-type, JSON path.
24.testIntegrationTest_MultipleOperations()
● Start full Spring context.● Call multiple REST endpoints.● Verify data persisted correctly.
25.testDatabaseInitialization_SchemaCreated()
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 59/60
● Verify tables created from JPA entities.● Verify columns match entity properties.● Verify indexes created.
26.testProfileSpecificConfiguration_Development()
● Activate development profile.● Verify H2 database used.● Verify logging level DEBUG.
27.testProfileSpecificConfiguration_Production()
● Activate production profile.● Verify MySQL connection attempted.● Verify logging level WARNING.
28.testRESTEndpointSecurity_Unauthorized()
● Attempt access without authentication (future test).● Verify response 401 Unauthorized.
29.testRESTEndpointSecurity_WithAuthentication()
● Provide authentication token (future test).● Verify successful access.
30.testMessageConverter_JSONToObject()
● JSON in request body converted to DTO.● Verify all fields populated correctly.
31.testMessageConverter_ObjectToJSON()
● Object returned from endpoint.● Verify JSON output matches expected format.
32.testHttpStatusCodes_Success()
● Successful operations return 200 OK.● Resource created returns 201 Created.
33.testHttpStatusCodes_ClientErrors()
● Bad request returns 400.● Not found returns 404.● Conflict returns 409.
34.testHttpStatusCodes_ServerErrors()
● Server error returns 500.● Service unavailable returns 503.
35.testRestDocumentation_OperationDetails()
● The operation endpoint has a description.● Parameters documented.● Response schema shown.
Conclusion:
By implementing UC17, we have successfully migrated the QuantityMeasurement application to Spring Boot, leveraging its powerfulfeatures for dependency injection, RESTful API development, JPAintegration, and more. The application is now more robust,maintainable, and easier to test, with comprehensive APIdocumentation and rich test reports to ensure the quality andreliability of the application. This migration has also set a strongfoundation for future enhancements, such as adding security withSpring Security, implementing additional features, and scaling theapplication as needed. The use of Spring Boot has significantlyimproved the development experience and has made it easier tomanage the application lifecycle, from development to productiondeployment.
Published using Google Docs Report abuse Learn more
UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement Updated automatically every 5 minutes
19/06/2026, 08:43 UC17: Spring Framework Integration - REST Services and JPA for Quantity Measurement
https://docs.google.com/document/d/e/2PACX-1vQ9Q_8l90uOZZxLqyOJrrV4wTdYLjgP0r3Gon8FMjC-cQamoaS5zn8Kz2GFIZdG_rJCfE-AxCI7… 60/60


---
# UC1_ Feet measurement equality(1)

UC1: Feet measurementequality
Description
The QuantityMeasurementApp class is
responsible for checking the equality of two
numerical values measured in feet within the
Quantity Measurement Application. It ensures
accurate comparisons and handles various edge
cases.
Preconditions
● The QuantityMeasurementApp class is
instantiated.
● Two numerical values in feet are
provided for comparison.
Main Flow
1. User inputs two numerical values in feet.
2. The class validates the input values to
ensure they are numeric.
3. The class compares the two values for
equality.
4. The result of the comparison is returned
to the user.
Postconditions
● The equality result (true or false) is
returned based on the comparison of the
two values.
HINTS FOR IMPLEMENTING UC1:
Step 1 – Import necessary classes
● Consider if you need any Java utility
classes for this implementation
Step 2 – Class Design
Published using Google Docs Report abuse Learn more
UC1: Feet measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC1: Feet measurement equality
https://docs.google.com/document/d/e/2PACX-1vSUTimZiVryZfSPakJMzIl00VfkjBlX6-HtEGZPMRd-bie8x5e2_qz7Fp5dSt3Flv-pu82fy-nMOOUi/pub 1/5
● Define the main class that will contain the
Feet inner class
● Think about access modifiers and
visibility
Step 3 – Inner Class Structure
● Create a Feet class to represent a feet
measurement
● Use encapsulation to store the
measurement value as a private final field
● Ensure immutability by making the value
final
Step 4 – Constructor
● Initialize the value field in the constructor
● Consider what validation might be
needed (though UC1 may not require it)
Step 5 – Equals Method Implementation
● Override equals() from the Object class
● Check if the object is the same reference
(this == obj)
● Check if the object is null or a different
type
● Cast to Feet type safely
● Compare double values
using Double.compare() instead
of == operator
Step 6 – Main Method
● Instantiate two Feet objects with test
values
● Use the equals() method to compare
them
● Print the result to verify equality check
Code Snippet
QuantityMeasurementApp
Published using Google Docs Report abuse Learn more
UC1: Feet measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC1: Feet measurement equality
https://docs.google.com/document/d/e/2PACX-1vSUTimZiVryZfSPakJMzIl00VfkjBlX6-HtEGZPMRd-bie8x5e2_qz7Fp5dSt3Flv-pu82fy-nMOOUi/pub 2/5
Example Output of running the
App
● Input: 1.0 ft and 1.0 ft
● Output: Equal (true)
Concepts learned byimplementing UC1:
1. Object Equality – Understanding howto properly override equals() method.
2. Floating-point Comparison – UsingDouble.compare() for precisecomparison instead of == operator
3. Null Checking – Validating null objectsbefore casting to preventNullPointerException
4. Type Checking –Using getClass() toensure type safety during comparison
5. Object-Oriented Design – Encapsulation of value within a class
6. Unit Testing Best Practices –
● One assertion per test (ideally)● Descriptive test names followinggiven-when-then pattern
● Clear failure messages fordebugging
Key Concepts Tested:
Published using Google Docs Report abuse Learn more
UC1: Feet measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC1: Feet measurement equality
https://docs.google.com/document/d/e/2PACX-1vSUTimZiVryZfSPakJMzIl00VfkjBlX6-HtEGZPMRd-bie8x5e2_qz7Fp5dSt3Flv-pu82fy-nMOOUi/pub 3/5
1. Equality Contract (equals() method) :
● Reflexive: a.equals(a) must returntrue● Symmetric: if a.equals(b) thenb.equals(a)● Transitive: if a.equals(b) andb.equals(c) then a.equals(c)● Consistent: multiple calls returnthe same result
● Null handling: a.equals(null) mustreturn false
2. Type Safety
● Objects should only be equal toobjects of the same type● Prevents ClassCastException andlogic errors
3. Value-Based Equality● Two objects with the same valuesshould be considered equal● Different values should result ininequality
4. Null Safety
● Proper null checks preventNullPointerException
● Object comparison should handlenull gracefully
Test Case Examples:
1. testEquality_SameValue() –
● Verifies that two numerical valuesof 1.0 ft are considered equal.
● Tests: equals() returns true whencomparing 1.0 ft with 1.0 ft.
2. estEquality_DifferentValue() –
● Verifies that two numerical valuesof 1.0 ft and 2.0 ft are not equal.● Tests: equals() returns false whencomparing 1.0 ft with 2.0 ft.
3. testEquality_NullComparison() –
● Verifies that a numerical value isnot equal to null.● Tests: equals() returns false whencomparing a value with null.
4. testEquality_NonNumericInput() –
● Verifies that non-numeric inputsare handled appropriately.
● Tests: equals() returns false whencomparing a numeric value with anon-numeric input.
5. testEquality_SameReference() –
● Verifies that a numerical value isequal to itself (reflexive property).
● Tests: equals() returns true whencomparing a value with itself.
Code Snippet of
QuantityMeasurementAppTest
Published using Google Docs Report abuse Learn more
UC1: Feet measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC1: Feet measurement equality
https://docs.google.com/document/d/e/2PACX-1vSUTimZiVryZfSPakJMzIl00VfkjBlX6-HtEGZPMRd-bie8x5e2_qz7Fp5dSt3Flv-pu82fy-nMOOUi/pub 4/5
Published using Google Docs Report abuse Learn more
UC1: Feet measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC1: Feet measurement equality
https://docs.google.com/document/d/e/2PACX-1vSUTimZiVryZfSPakJMzIl00VfkjBlX6-HtEGZPMRd-bie8x5e2_qz7Fp5dSt3Flv-pu82fy-nMOOUi/pub 5/5


---
# UC2_ Feet and Inches measurement equality(1)

UC2: Feet and Inchesmeasurement equality
Description
This Use Case extends UC1 to accommodate theEquality Check for Inches along with Feet. Thisuse case is in no way trying to compare twoentities, Feet and Inches. They are still treatedseparately. Please ensure like UC1 the test casesensure complete test coverage to accuratelycompare and handle various edge cases
Preconditions
● The QuantityMeasurementApp class is
instantiated.
● Two numerical values in feet and inches
are hard-coded for comparison.
Main Flow
1. The main method calls the static method,
which validates two numerical values in
feet.
2. The main method calls the static method,
which validates two numerical values in
inches.
3. These static methods internally instantiate
the Feet and Inches class and then call
the equality method.
4. Both classes validate the input values to
ensure they are numeric.
5. Both classes compare the two values for
equality.
6. The result of the comparison is returned
to the user.
Postconditions
● The equality result (true or false) is
returned based on the comparison of the
converted values.
Published using Google Docs Report abuse Learn more
UC2: Feet and Inches measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC2: Feet and Inches measurement equality
https://docs.google.com/document/d/e/2PACX-1vQ1wcA_gM4PVqaEnDp9tJIzz3_yC7T7svc0alUmNQCFwfKI_nrprfH5BNMo-rHbrv8btvmJpH59qz… 1/4
● Both inch-to-inch and feet-to-inch
comparisons are supported.
HINTS FOR IMPLEMENTING UC1:
Step 1 – Compare the equality of two Inches
measurements along with Feet measurements by
implementing a separate Inches class similar to
the Feet class.
Step 2 – Create two Inches objects with the
same value and use the equals() method to
verify they are equal on the same lines of feet.
Also, create two Inches objects with different
values and verify they are not equal.
Step 3 – Plus, reduce the dependency on the
main method by defining separate methods for
Feet and Inches equality checks.
Code Snippet
Example Output of running the
App
● Input: 1.0 inch and 1.0 inch
● Output: Equal (true)
● Input: 1.0 ft and 1.0 ft
● Output: Equal (true)
Concepts Learned by
Implementing UC2:
Published using Google Docs Report abuse Learn more
UC2: Feet and Inches measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC2: Feet and Inches measurement equality
https://docs.google.com/document/d/e/2PACX-1vQ1wcA_gM4PVqaEnDp9tJIzz3_yC7T7svc0alUmNQCFwfKI_nrprfH5BNMo-rHbrv8btvmJpH59qz… 2/4
The Concepts very similar to UC1 of Object
Equality, Floating-point Comparison, Null
Checking, Type Checking, and Object
Encapsulation of values
Key Concepts Tested:
These are very similar to UC1 of EqualityContract, Type Safety, Value-Based Equality, andNull Safety.
Test Case Examples:
These are also very similar to UC1
1. testEquality_SameValue()2. testEquality_DifferentValue()3. testEquality_NullComparison()
4. testEquality_NonNumericInput()5. testEquality_SameReference()
Code Snippet for Test Cases
Published using Google Docs Report abuse Learn more
UC2: Feet and Inches measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC2: Feet and Inches measurement equality
https://docs.google.com/document/d/e/2PACX-1vQ1wcA_gM4PVqaEnDp9tJIzz3_yC7T7svc0alUmNQCFwfKI_nrprfH5BNMo-rHbrv8btvmJpH59qz… 3/4
Disadvantage of using separateFeet and Inches classes:
The current implementation violates the DRY(Don't Repeat Yourself) principle. Both Feet andInches classes contain nearly identical code:
● Same constructor pattern● Identical equals() method implementation● Same value field and logic
This code duplication makes maintenancedifficult. Any changes to the equality logic mustbe applied to both classes separately, increasingthe risk of bugs and inconsistencies. A betterapproach would be to create a generic Quantityclass or use a single class with a unit typeparameter to eliminate this redundancy.
Published using Google Docs Report abuse Learn more
UC2: Feet and Inches measurement equality Updated automatically every 5minutes
19/06/2026, 08:32 UC2: Feet and Inches measurement equality
https://docs.google.com/document/d/e/2PACX-1vQ1wcA_gM4PVqaEnDp9tJIzz3_yC7T7svc0alUmNQCFwfKI_nrprfH5BNMo-rHbrv8btvmJpH59qz… 4/4


---
# UC3_ Generic Quantity Class for DRY Principle

UC3: Generic QuantityClass for DRY Principle
Description
UC3 is designed to overcome the Disadvantageof using Feet and Inches which starts violatingthe DRY principle, where both Feet and Inchesclasses contain nearly identical code, having thesame constructor pattern, Identical equals()method implementation.
This Use Case refactors the existing Feet andInches classes into a single generic QuantityLength class that eliminates code duplicationwhile maintaining all functionality from UC1 andUC2. The Quantity Length class represents anymeasurement with a value and unit type,applying the DRY (Don't Repeat Yourself)principle. This reduces maintenance burden andmakes the codebase more scalable for addingnew units in the future.
Preconditions
● The QuantityMeasurementApp class is
instantiated.
● Two numerical values with their
respective unit types (feet, inches, etc.)
are provided for comparison.
● The conversion factors between
supported units are defined as constants.
Main Flow
1. User inputs two numerical values with
their respective unit types.
2. The Quantity Length class validates the
input values to ensure they are numeric.
3. The Quantity Length class validates the
unit type against supported units.
4. Both values are converted to a common
base unit (e.g., feet) using conversion
factors.
5. The converted values are compared for
equality.
6. The result of the comparison is returned
to the user.
Published using Google Docs Report abuse Learn more
UC3: Generic Quantity Class for DRY Principle Updated automatically every 5minutes
19/06/2026, 08:32 UC3: Generic Quantity Class for DRY Principle
https://docs.google.com/document/d/e/2PACX-1vQ6uL5FPedng7ETGpILAwYSmCeYhunoFdbRUQmwG49gjk3GWtD8144UOH_4AXo39HMutDm… 1/8
Postconditions
● The equality result (true or false) is
returned based on the comparison of the
converted values.
● All previous functionality from UC1 and
UC2 is preserved and works correctly.
● Code duplication is eliminated;
maintenance is simplified.
HINTS FOR IMPLEMENTING UC3:
Step 1 – Create a LengthUnit Enum. An enum
is a special Java type used to define a collection
of constants. Here, we define different length
units and their conversion factors relative to a
base unit (feet). We can add more units as
needed. Also include a method to get the
conversion factor for each unit.
Step 2 – Create Quantity Length Class to
represent length measurements along with their
units defined as an enum. Implement the
equals() method to compare lengths by
converting them to a common base unit (feet)
before comparison.
Code Snippet
Published using Google Docs Report abuse Learn more
UC3: Generic Quantity Class for DRY Principle Updated automatically every 5minutes
19/06/2026, 08:32 UC3: Generic Quantity Class for DRY Principle
https://docs.google.com/document/d/e/2PACX-1vQ6uL5FPedng7ETGpILAwYSmCeYhunoFdbRUQmwG49gjk3GWtD8144UOH_4AXo39HMutDm… 2/8
Published using Google Docs Report abuse Learn more
UC3: Generic Quantity Class for DRY Principle Updated automatically every 5minutes
19/06/2026, 08:32 UC3: Generic Quantity Class for DRY Principle
https://docs.google.com/document/d/e/2PACX-1vQ6uL5FPedng7ETGpILAwYSmCeYhunoFdbRUQmwG49gjk3GWtD8144UOH_4AXo39HMutDm… 3/8
Example Output of running the
App
● Input: Quantity(1.0, "feet") and
Quantity(12.0, "inches")
● Output: Equal (true)
● Input: Quantity(1.0, "inch") and
Quantity(1.0, "inch")
● Output: Equal (true)
Concepts Learned byImplementing UC3:
1. DRY PRINCIPLE (Don't RepeatYourself)
● Eliminates code duplication byconsolidating similar functionality● Reduces maintenance burden andpotential bugs
2. POLYMORPHISM
● Uses a single QuantityLength classwith an enum to handle multipleunit types
● Demonstrates runtimepolymorphic behavior through
Published using Google Docs Report abuse Learn more
UC3: Generic Quantity Class for DRY Principle Updated automatically every 5minutes
19/06/2026, 08:32 UC3: Generic Quantity Class for DRY Principle
https://docs.google.com/document/d/e/2PACX-1vQ6uL5FPedng7ETGpILAwYSmCeYhunoFdbRUQmwG49gjk3GWtD8144UOH_4AXo39HMutDm… 4/8
method parameters
3. ENUM USAGE
● LengthUnit enum encapsulates allpossible measurement units
● Provides type-safe constantsinstead of magic strings/numbers
4. ABSTRACTION● Hides implementation details ofunit conversion and comparison● Client code focuses on businesslogic rather than unit handling
5. ENCAPSULATION
● Units and values are bundledtogether in a single class● Provides controlled accessthrough methods
6. EQUALS METHOD OVERRIDE
● Implements value-based equalitycomparison
● Handles cross-unit comparisons(e.g., 1 Foot == 12 Inches)
7. SINGLE RESPONSIBILITY PRINCIPLE● QuantityLength handles all lengthmeasurement logic● Separation of concerns:measurement logic vs. demologic
8. SCALABILITY
● Making it easier to add new unitswithout duplicating code.
9. REFACTORING BEST PRACTICES:
● Safely consolidating similarclasses while maintainingbackward compatibility.
Key Concepts Tested:
1. Equality Contract (equals() method) :● Reflexive: a.equals(a) must returntrue
● Symmetric: if a.equals(b) thenb.equals(a)
● Transitive: if a.equals(b) andb.equals(c) then a.equals(c)● Consistent: multiple calls returnthe same result● Null handling: a.equals(null) mustreturn false
2. Type Safety● Objects should only be equal toobjects of the same type
● Prevents ClassCastException andlogic errors
Published using Google Docs Report abuse Learn more
UC3: Generic Quantity Class for DRY Principle Updated automatically every 5minutes
19/06/2026, 08:32 UC3: Generic Quantity Class for DRY Principle
https://docs.google.com/document/d/e/2PACX-1vQ6uL5FPedng7ETGpILAwYSmCeYhunoFdbRUQmwG49gjk3GWtD8144UOH_4AXo39HMutDm… 5/8
3. Value-Based Equality
● Two objects with same valuesshould be considered equal● Different values should result ininequality
4. Null Safety● Proper null checks preventNullPointerException● Object comparison should handlenull gracefully
Test Case Examples:
1. Unit Abstraction –
● Single class handles multiple unittypes.● Conversion logic is centralizedand consistent.
2. Cross-Unit Equality –
● Objects with different units butequivalent values are equal.● Conversion accuracy ismaintained across all unitcombinations.
3. Same-Unit Equality –
● Two measurements of the sameunit with the same values areequal.● Unit consistency is properlymaintained.
4. Type and Unit Safety –
● Only supported units (defined inenum) are accepted.
● Invalid units are rejectedappropriately.
5. Code Consolidation) –
● Equals method works identicallyfor all unit types.● No code duplication existsbetween unit implementations.
6. Backward Compatibility –
● All UC1 and UC2 test cases passwithout modification.
● Existing functionality remainsunaffected.
Test Case Examples:
1. testEquality_FeetToFeet_SameValue()–
● Verifies that Quantity(1.0, "feet")equals Quantity(1.0, "feet").● Tests: equals() returns true foridentical feet measurements.
2. testEquality_InchToInch_SameValue()
Published using Google Docs Report abuse Learn more
UC3: Generic Quantity Class for DRY Principle Updated automatically every 5minutes
19/06/2026, 08:32 UC3: Generic Quantity Class for DRY Principle
https://docs.google.com/document/d/e/2PACX-1vQ6uL5FPedng7ETGpILAwYSmCeYhunoFdbRUQmwG49gjk3GWtD8144UOH_4AXo39HMutDm… 6/8
● Verifies that Quantity(1.0, "inch")equals Quantity(1.0, "inch").
● Tests: equals() returns true foridentical inch measurements.
3. testEquality_NullComparison() –
● Verifies that Quantity(1.0, "feet")equals Quantity(12.0, "inch").● Tests: equals() returns true whenfeet and inches are equivalent.
4. testEquality_InchToFeet_EquivalentValue()–
● Verifies that Quantity(12.0,"inch") equals Quantity(1.0,"feet").● Tests: equals() returns true (testssymmetry of conversion).
5. testEquality_FeetToFeet_DifferentValue()– ● Verifies that Quantity(1.0, "feet")does not equal Quantity(2.0,"feet").● Tests: equals() returns false fordifferent feet measurements.
6. testEquality_InchToInch_DifferentValue()–
● Verifies that Quantity(1.0, "inch")does not equal Quantity(2.0,"inch").● Tests: equals() returns false fordifferent inch measurements.
7. testEquality_InvalidUnit() –
● Verifies that invalid unit types arerejected appropriately.● Tests: Exception or validation errorfor unsupported units.
8. testEquality_NullUnit() –● Verifies that the null unit ishandled appropriately.● Tests: equals() returns false orthrows an exception when the unitis null.
9. testEquality_SameReference() –
● Verifies that a Quantity objectequals itself (reflexive property).
● Tests: equals() returns true whencomparing an object with itself.
10.testEquality_NullComparison() –● Verifies that a Quantity object isnot equal to null.● Tests: equals() returns false whencomparing with null.
Published using Google Docs Report abuse Learn more
UC3: Generic Quantity Class for DRY Principle Updated automatically every 5minutes
19/06/2026, 08:32 UC3: Generic Quantity Class for DRY Principle
https://docs.google.com/document/d/e/2PACX-1vQ6uL5FPedng7ETGpILAwYSmCeYhunoFdbRUQmwG49gjk3GWtD8144UOH_4AXo39HMutDm… 7/8
Code Snippet for Test Case
Samples
Published using Google Docs Report abuse Learn more
UC3: Generic Quantity Class for DRY Principle Updated automatically every 5minutes
19/06/2026, 08:32 UC3: Generic Quantity Class for DRY Principle
https://docs.google.com/document/d/e/2PACX-1vQ6uL5FPedng7ETGpILAwYSmCeYhunoFdbRUQmwG49gjk3GWtD8144UOH_4AXo39HMutDm… 8/8


---
# UC4_ Extended Unit Support(1)

UC4: Extended UnitSupport
Description
UC4 extends UC3 by introducing Yards andCentimeters as additional length units to theQuantityLength class. This use case demonstrateshow the generic Quantity class design scaleseffortlessly to accommodate new units withoutcode duplication. Yards will be added to theLengthUnit enum with the appropriate conversionfactor (1 yard = 3 feet) and (1cm = 0.393701in),and all equality comparisons will work seamlesslyacross feet, inches, yards, and cms.
Preconditions
● The QuantityMeasurementApp class is
instantiated with the refactored
QuantityLength class from UC3.
● Two numerical values, with their respective
units (feet, inches, yards), are provided for
comparison.
● The conversion factor for yards (1 yard = 3
feet) is defined in the LengthUnit enum.
● The conversion factor for yards (1 cm =
0.393701 in) is defined in the LengthUnit
enum.
Main Flow
1. Users input two numerical values with their
respective unit types (feet, inches, yards or
cms).
2. The QuantityLength class validates the
input values to ensure they are numeric.
3. The QuantityLength class validates the unit
type against supported units (feet, inches,
yards, cms).
4. Both values are converted to a common
base unit (in or feet) using conversion
factors.
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 1/9
5. The converted values are compared for
equality.
6. The result of the comparison is returned to
the user.
Postconditions
● The equality result (true or false) is
returned based on the comparison of the
converted values.
● All previous functionality from UC1, UC2,
and UC3 is preserved and works correctly.
● Yard-to-yard, yard-to-feet, and yard-to-
inches comparisons are fully supported.
● Similarly, all comparisons with respect to
centimeters should be supported (cm-to-
cm, cm-to-inch, cm-to-feet, etc.)
● Code remains free of duplication; adding
new units requires only enum modification.
HINTS FOR IMPLEMENTING
UC1:
Step 1 – Update LengthUnit Enum
● Add YARDS constant to the LengthUnit
enum with conversion factor 3.0 (since 1
yard = 3 feet).
● - Add CENTIMETERS constant to the
LengthUnit enum with conversion factor
(since 1 cm = 0.393701 in).
● - Verify that the conversion factor
calculation is correct: 1 yard ÷ 1 foot = 3.0
or 1 cm  ÷ 1 in = 0.39307
● Verify that the conversion factor
calculation is correct: 1 yard ÷ 1 foot = 3.0.
Step 2 – Verify QuantityLength Class
● Confirm that the existing equals() method
and convertToFeet() logic work correctly
for the new unit.
● No changes to the QuantityLength class
should be needed due to the generic design
from UC3.
Step 3 – Test Coverage
● Ensure comprehensive test cases cover
yard-to-yard, yard-to-feet, and yard-to-
inches comparisons.
● Ensure comprehensive test cases cover
yard-to-cm, cm-to-cm, and cm-to-inches,
etc comparisons.
● Verify cross-unit equality with various
combinations.
Code Snippet
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 2/9
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 3/9
Example Output of running the
App
● Input: Quantity(1.0, YARDS) and
Quantity(3.0, FEET)
● Output: Equal (true)
● Input: Quantity(1.0, YARDS) and
Quantity(36.0, INCHES)
● Output: Equal (true)
● Input: Quantity(2.0, YARDS) and
Quantity(2.0, YARDS)
● Output: Equal (true)
● Input: Quantity(2.0, CENTIMETERS) and
Quantity(2.0, CENTIMETERS)
● Output: Equal (true)
● Input: Quantity(1.0, CENTIMETERS) and
Quantity(0.393701, INCHES)
● Output: Equal (true)
Concepts Learned by ImplementingUC4:
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 4/9
1. SCALABILITY OF GENERIC DESIGN
● Adding new units requires onlyenum modification, no classrestructuring.● Demonstrates the power of properabstraction and design patterns.
2. CONVERSION FACTORMANAGEMENT
● Centralized definition of conversionfactors in the enum.
● Ensures consistency and reducescalculation errors.
3. UNIT RELATIONSHIPS
● Understanding how different unitsrelate to a common base unit.
● 1 yard = 3 feet = 36 inches or 1 cm= 0.393701
4. ENUM EXTENSIBILITY
● Enums can be extended with newconstants without breaking existingcode.● Type-safe approach to managingunit variations.
5. MATHEMATICAL ACCURACY
● Conversion factors must becalculated precisely relative to thebase unit.● Cross-unit comparisons depend onaccurate conversion mathematics.
6. DRY PRINCIPLE VALIDATION
● Proves that the generic designeliminates duplication when addingnew units.
● A separate Yards class would not beneeded.
7. BACKWARD COMPATIBILITY
● The addition of a new unit does notaffect existing feet-and-inchesfunctionality.● All previous test cases continue topass.
Key Concepts Tested:
1. Yard-to-Yard Equality :
● Two measurements in yards withthe same value are equal.
● Different yard values are not equal.
2. Cross-Unit Yard Conversions
● 1 yard equals 3 feet.● 1 yard equals 36 inches.
● Symmetric equality (yard-to-feetand feet-to-yard comparisons workboth ways).
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 5/9
3. CM-to-CM Equality
● Two measurements in cms with thesame value are equal.
● Different cms values are not equal.
4. Cross-Unit Yard Conversions
● 1 cm equals 0.393701 in.● Symmetric equality (cm-to-feet andcm-to-yard, etc comparisons workboth ways)
5. Multi-Unit Comparisons
● Complex conversions involvingyards, feet, and inches together.● Transitive property: if A = B and B= C, then A = C.
6. Unit Validation
● Yards are recognized as a valid unit.
● Invalid units are still rejectedappropriately.
7. Precision and Rounding
● Conversions maintain mathematicalaccuracy across unit boundaries.● Double precision comparisonsremain consistent.
Test Case Examples:
1. testEquality_YardToYard_SameValue()– 
● Verifies that Quantity(1.0, YARDS)equals Quantity(1.0, YARDS).● Tests: equals() returns true foridentical yard measurements.
2. testEquality_YardToYard_DifferentValue()–
● Verifies that Quantity(1.0, YARDS)does not equal Quantity(2.0,YARDS).
● Tests: equals() returns false fordifferent yard measurements.
3. testEquality_YardToFeet_EquivalentValue()– 
● Verifies that Quantity(1.0, YARDS)equals Quantity(3.0, FEET).● Tests: equals() returns true forequivalent yard-to-feet conversion.
4. testEquality_FeetToYard_EquivalentValue()– 
● Verifies that Quantity(3.0, FEET)equals Quantity(1.0, YARDS).
● Tests: equals() returns true (testssymmetry of conversion).
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 6/9
5. testEquality_YardToInches_EquivalentValue()– 
● Verifies that Quantity(1.0, YARDS)equals Quantity(36.0, INCHES).● Tests: equals() returns true forequivalent yard-to-inchesconversion.
6. testEquality_InchesToYard_EquivalentValue()– 
● Verifies that Quantity(36.0,INCHES) equals Quantity(1.0,YARDS).● Tests: equals() returns true (testssymmetry of conversion).
7. testEquality_YardToFeet_NonEquivalentValue()– 
● Verifies that Quantity(1.0, YARDS)does not equal Quantity(2.0,FEET).● Tests: equals() returns false whenconversions don't match.
8. testEquality_centimetersToInches_EquivalentValue()– 
● Verifies that Quantity(1.0,CENTIMETERS) equalsQuantity(0.393701, INCHES).● Tests: equals() returns true (testssymmetry of conversion).
9. testEquality_centimetersToFeet_NonEquivalentValue()– 
● Verifies that Quantity(1.0,CENTIMETERS) does not equalQuantity(1.0, FEET).● Tests: equals() returns false whenconversions don't match.
10.testEquality_MultiUnit_TransitiveProperty()– 
● Verifies transitive property: if Aequals B and B equals C, then Aequals C.● Example: Quantity(1.0, YARDS)equals Quantity(3.0, FEET) andQuantity(3.0, FEET) equalsQuantity(36.0, INCHES), thereforeQuantity(1.0, YARDS) equalsQuantity(36.0, INCHES).
11.testEquality_YardWithNullUnit() – 
● Verifies that the null unit is handledappropriately.
● Tests: equals() returns false orthrows an exception when the unitis null.
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 7/9
12.testEquality_YardSameReference() – 
● Verifies that a Quantity yard objectequals itself (reflexive property).
● Tests: equals() returns true whencomparing an object with itself.
13.testEquality_YardNullComparison() – 
● Verifies that a Quantity yard objectis not equal to null.● Tests: equals() returns false whencomparing with null.
14.testEquality_CentimetersWithNullUnit()– 
● Verifies that the null unit is handledappropriately.
● Tests: equals() returns false orthrows an exception when the unitis null.
15.testEquality_CentimetersSameReference()– 
● Verifies that a Quantity yard objectequals itself (reflexive property).
● Tests: equals() returns true whencomparing an object with itself.
16.testEquality_CentimetersNullComparison()– 
● Verifies that a Quantity yard objectis not equal to null.● Tests: equals() returns false whencomparing with null.
17.testEquality_AllUnits_ComplexScenario()– 
● Verifies complex scenarioscombining yards, feet, and inches.
● Example: Quantity(2.0, YARDS)equals Quantity(6.0, FEET) equalsQuantity(72.0, INCHES).
Code Snippet for Test Case Samples
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 8/9
Published using Google Docs Report abuse Learn more
UC4: Extended Unit Support Updated automatically every 5minutes
19/06/2026, 08:32 UC4: Extended Unit Support
https://docs.google.com/document/d/e/2PACX-1vQJe784U7aP61saF4WGFgZjhSHrIQR97JF4RUE6vGS5fcwwmtEVVWrMQWk19s8A-AimKOA3… 9/9


---
# UC5_ Unit-to-Unit Conversion(1)

UC5: Unit-to-UnitConversion (SameMeasurement Type)
Description
UC5 extends UC4 by providing explicitconversion operations between length units(e.g., feet →  inches, yards →  inches,centimeters →  feet). Instead of only comparingequality, the Quantity Length API exposes aconversion method that returns a numeric valueconverted from a source unit to a target unitusing the centralized conversion factors.
Preconditions
● Quantity Length class (from UC3/UC4)
and LengthUnit enum exist and include
FEET, INCHES, YARDS, CENTIMETERS.
● The conversionFactor for each LengthUnit
is defined relative to the chosen base
unit (feet or another consistent base).
● Input: numeric value, a valid source
LengthUnit, and a valid target LengthUnit.
Main Flow
● Client calls Quantity
Length.convert(value, sourceUnit,
targetUnit) or uses an instance method to
request conversion.
● The method validates:
● value is a finite number
(Double.isFinite or equivalent).
● sourceUnit and targetUnit are non-
null and members of LengthUnit.
● Convert the input value to the common
base unit (e.g., feet) using
sourceUnit.getConversionFactor().
● Convert from the base unit to the target
unit by dividing by
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 1/15
targetUnit.getConversionFactor() (or
multiplying by appropriate reciprocal).
● Apply optional rounding or precision
handling (caller-specified or a default
epsilon).
Return the converted numeric value to the caller.
Postconditions
● A numeric value representing the
original measurement expressed in the
target unit is returned.
● Invalid inputs (null unit, unsupported
unit, NaN, infinite) result in a
documented exception (e.g.,
IllegalArgumentException) or a well-
defined error response.
● Conversion preserves mathematical
equivalence within floating-point
precision limits.
Concepts learned
1. Enum with conversion factors :
This design pattern allows easy addition of new
units by simply adding new enum constants with
their conversion factors. Enums provide type
safety and clarity. Enums can encapsulate
related data and behavior, making the code
more organized. It is similar to a class but with a
fixed set of constants. The enum constants are
also immutable by nature.
2. Immutability :
Immutability ensures that the conversion factors
remain constant throughout the application
lifecycle. Immutability also makes enums thread-
safe, as their state cannot be changed after
creation. Immutable means that the state of an
object cannot be modified after it is created.
3. Value object semantics and
immutability :
This means that instances are treated as
immutable values. They are used to represent a
specific length measurement and do not change
state after creation. Hence the convertTo method
returns a new instance rather than modifying the
existing one.
4. JavaDoc documentation for classes
and methods :
This provides clear explanations of the purpose,
behavior, and usage of the class and its
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 2/15
methods. For class-level documentation, it
describes the overall functionality, design
decisions, and key concepts. For method-level
documentation, it explains parameters, return
values and any exceptions thrown.
5. The private methods :
The Private methods are not exposed to the
outside world and can only be accessed within
the class. This helps in maintaining
encapsulation and abstraction. Here private
methods are used for:
● **Private helper methods :**
They are used for conversion and
comparison. This encapsulates
logic and improves readability.
● **Private utility method :** These
are used for base unit conversion.
This centralizes the conversion
logic.
6. Method Overriding :
Method overriding is a fundamental concept in
object-oriented programming that allows a
subclass to provide a specific implementation of
a method that is already defined in its
superclass. We have done Method Overriding
of two methods from Object super class:
● **Overriding of equals() method
:**  Overriding `equals()`
method is done for writing
custom equality logic. Here it is
Overriding the equals method
from Object class to provide
custom equality logic based on
converted values. This ensures
that two Quantity Length objects
are considered equal if their
values represent the same
physical length when converted to
the base unit.
● **Overriding of toString()
method :** Overriding of
`toString()` method for better
readability. This overrides the
default toString method from
Object class. This provides a
human-readable representation of
the object, which is useful for
debugging and logging.
7. Method Overloading Concept :
Method Overloading allows a class to have
multiple methods with the SAME NAME but
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 3/15
DIFFERENT PARAMETER LISTS. The compiler
determines which method to call based on the
number, type, and order of arguments passed at
runtime.
Benefits:
● Improves code readability and
usability
● Provides flexibility in how
methods can be invoked
● Reduces the need for different
method names doing similar
operations
In this class, demonstrateLengthConversion() is
overloaded:
1. demonstrateLengthConversion(double,
LengthUnit, LengthUnit)
● Takes a numeric value and two
units (from and to)
● Used when you have raw values to
convert
2.
demonstrateLengthConversion(QuantityLength,
LengthUnit)
● Takes an existing QuantityLength
object and target unit
● Used when you already have a
QuantityLength instance
Example Usage:
Method 1: demonstrateLengthConversion(3.0,
FEET, INCHES)
Method
2: demonstrateLengthConversion(lengthInYards,
INCHES)
8. Logic Used :
Unit Conversion Logic: Implementing
conversion methods that normalize values to a
base unit before converting to the target unit.
● Input Validation: Ensuring that
conversions are only performed
between compatible units
● Exception Handling: Throwing
appropriate exceptions for invalid
inputs or incompatible unit pairs.
● Precision Handling: Returning
results with defined precision for
consistency. Rounding to two
decimal places for equality
checks.
● Instance method for unit
conversion: Instance method is
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 4/15
used for conversion between any
supported units. Instance method
operates on the instance's state
and returns a new instance with
the converted value.
● Main method for standalone
testing: This allows quick
verification of functionality without
needing a separate test
framework.
9. API Design :
QuantityMeasurementApp provides a standard
interface for comparison and conversion
functionality by creating clear and usable static
methods. API like static methods are defined to
demonstrate functionality and validate
correctness. These methods help in creating
interfaces for testing and showcasing the
comparison and conversion features.
● demonstrateLengthConversion
method: This method
demonstrates the conversion
feature by taking in parameters
for value, fromUnit, and toUnit. It
creates a Quantity Length object
and calls the convertTo method to
perform the conversion. This
method showcases how to use the
conversion functionality in a
practical scenario.
● demonstrateLengthEquality
method: This method
demonstrates the equality check
feature by taking in two Quantity
Length objects as parameters. It
checks if the two lengths are
equal using the equals method
and prints the result. This method
showcases how to use the equality
check functionality in a practical
scenario.
● demonstrateLengthComparison
method: This method
demonstrates the comparison
feature by taking in values and
units for two lengths. It creates
two Quantity Length objects and
calls the
demonstrateLengthEquality
method to check their equality.
This method showcases how to
use the comparison functionality
in a practical scenario.
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 5/15
Code Snippet for the Length
Class
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 6/15
Code Snippet for
QuantityMeasurementApp class
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 7/15
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 8/15
Example Output of running the
App
● Input: convert(1.0, FEET, INCHES)
→  Output: 12.0
● Input: convert(3.0, YARDS, FEET)
→  Output: 9.0
● Input: convert(36.0, INCHES,
YARDS) →  Output: 1.0
● Input: convert(1.0,
CENTIMETERS, INCHES) →
Output: ~0.393701
● Input: convert(0.0, FEET,
INCHES) →  Output: 0.0
Key Concepts Tested:
1. Basic Unit Conversion :
● Single conversions betweenadjacent units (feet ↔  inches,yards ↔  feet).
● Verifies that conversion factors arecorrectly applied.
2. Cross-Unit Conversion
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmfS… 9/15
● Conversions between non-adjacent units (feet ↔centimeters, yards ↔  inches).● Tests multi-step conversionthrough base unit normalization.
3. Bidirectional Conversion
● Converting A →  B and then B →A yields the original value (withinepsilon).
● Ensures conversion logic issymmetric and reversible.
4. Base Unit Normalization
● All conversions are correctlynormalized to the common baseunit.● Verifies that conversion factorsrelative to the base unit areaccurate.
5. Conversion Factor Accuracy
● Conversion results matchmathematically expected values.● Example: 1 foot = 12 inches, 1yard = 3 feet, 1 cm = 0.393701inches.
6. Zero Value Conversion
● Converting zero in any unit yieldszero in the target unit.
● Example: convert(0.0, FEET,INCHES) = 0.0.
7. Negative Value Conversion
● Negative measurements convertcorrectly while preserving sign.● Example: convert(-1.0, FEET,INCHES) = -12.0.
8. Large Value Conversion
● Conversions of very largemagnitudes maintain precision.● Tests the floating-point accuracyacross large numbers.
9. Small Value Conversion
● Conversions of very smallmagnitudes maintain precision.
● Tests floating-point accuracy andepsilon-based tolerance.
10.Same-Unit Conversion
● Converting a unit to itself returnsthe original value unchanged.
● Example: convert(5.0, FEET,FEET) = 5.0.
11.Precision and Rounding
● Conversion results are withinacceptable floating-point epsilontolerance.
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmf… 10/15
● Consistent rounding behavioracross all conversions.
12.Invalid Unit Handling
● Null source or target units throwIllegalArgumentException.● Unsupported units are rejectedappropriately.
13.Invalid Value Handling
● NaN (Not a Number) values arerejected with a validation error.
● Infinite values (+ ∞ , - ∞ ) arerejected appropriately.
14.Overflow/Underflow Prevention
● Extremely large or small convertedvalues are handled gracefully.
● No overflow or underflowexceptions for valid conversions.
15.Round-Trip Conversion Accuracy
● Multiple sequential conversionspreserve the original value withintolerance.● Example:convert(convert(convert(v, A, B),B, C), C, A) ≈  v.
16.Unit Enum Integration
● Conversion correctly retrieves andapplies conversion factors fromthe LengthUnit enum.
● Enum constants are immutableand thread-safe.
17.Mathematical Consistency
● Conversion formula: result = value× (sourceUnit.factor /targetUnit.factor).● The formula consistently producescorrect results across all unitpairs.
18.API Usability
● The static convert() methodprovides a simple, intuitiveinterface.● The method signature clearlycommunicates the inputparameters and return type.
Test Case Examples:
1. testConversion_FeetToInches() –
● convert(1.0, FEET, INCHES)should return 12.0.
2. testConversion_InchesToFeet() –
● convert(24.0, INCHES, FEET)should return 2.0.
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmf… 11/15
3. testConversion_YardsToInches() –
● convert(1.0, YARDS, INCHES)should return 36.0.
4. testConversion_InchesToYards() –
● convert(72.0, INCHES, YARDS)should return 2.0.
5. testConversion_CentimetersToInches()–
● convert(2.54, CENTIMETERS,INCHES) should return ~1.0(within epsilon).
6. testConversion_FeatToYard() –
● convert(6.0, FEET, YARDS) shouldreturn 2.0.
7. testConversion_RoundTrip_PreservesValue()–
● Given value v and units A, B:convert(convert(v, A, B), B, A) ≈  vwithin defined tolerance.
8. testConversion_ZeroValue() –
● convert(0.0, FEET, INCHES)should return 0.0.
9. testConversion_NegativeValue() –
● convert(-1.0, FEET, INCHES)should return -12.0 (behaviordefined and asserted).
10.testConversion_InvalidUnit_Throws() –
● Passing a null or unsupported unitshould throw anIllegalArgumentException (ordefined exception).
11.testConversion_NaNOrInfinite_Throws()–
● Passing NaN or +/-Infinity as avalue should result in a validationfailure.
12.testConversion_PrecisionTolerance() –
● Conversion results are comparedusing a small epsilon (e.g., 1e-6)to account for floating-pointrounding.
Implementation note: add a public API such as
● static double convert(doublevalue, LengthUnit source,LengthUnit target) that internallynormalizes to the base unit andreturns the converted value;
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmf… 12/15
document expected exceptionsand precision guarantees.
Code Snippet for Test Case
Samples
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmf… 13/15
QuantityMeasuerementAppTest
Results
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmf… 14/15
Published using Google Docs Report abuse Learn more
UC5: Unit-to-Unit Conversion Updated automatically every 5minutes
19/06/2026, 08:32 UC5: Unit-to-Unit Conversion
https://docs.google.com/document/d/e/2PACX-1vQGod00-H31pK2uxc2bFfP6v37WyNEidIqdhuAS21w6Tr11GgimAUA5UPxQvyp9XtykA_3iBmf… 15/15


---
# UC6_ Addition of Two Length Units(1)

UC6: Addition of TwoLength Units (SameCategory)
Description
UC6 extends UC5 by introducing additionoperations between length measurements. Thisuse case enables the Quantity Length API to addtwo lengths of potentially different units (butsame category—length) and return the result inthe unit of the first operand. Essentially addinganother length to the current length. Forexample, adding 1 foot and 12 inches shouldyield 2 feet (based on the unit of the firstoperand).
Preconditions
● Quantity Length class (from
UC3/UC4/UC5) and LengthUnit enum
exist with FEET, INCHES, YARDS,
CENTIMETERS.
● The conversionFactor for each LengthUnit
is defined relative to a consistent base
unit.
● Two Quantity Length objects or raw
values with their respective units are
provided.
● A target unit is the unit of the first
operand.
● All units belong to the same
measurement category (length).
Main Flow
1. Client calls Quantity Length.add(length1,
length2, targetUnit) or uses an instance
method to add two length measurements.
2. The method validates:
● Both length1 and length2 are non-
null and have valid LengthUnits.
● All values are finite numbers
(Double.isFinite or equivalent).
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 1/12
3. Convert both length1 and length2 to a
common base unit (feet).
4. Add the converted values.
5. Convert the sum from the base unit to the
unit of the first operand.
6. Return a new Quantity Length object (or
numeric value) representing the result in
the unit of first operand.
Postconditions
● A new Quantity Length object is returned
with the sum of the two measurements
expressed in the unit of the first operand.
● The original Quantity Length objects
remain unchanged (immutability
principle).
● Invalid inputs (null units, unsupported
units, NaN, infinite) result in a
documented exception (e.g.,
IllegalArgumentException).
● Addition is mathematically accurate
within floating-point precision limits.
● Addition is commutative: add(A, B)
equals add(B, A).
Concepts Learned byImplementing UC6:
1. Arithmetic Operations on ValueObjects
● Value objects can encapsulatedomain operations beyond simplecomparison.
● Addition of measurements withimplicit unit conversiondemonstrates domain-specificlogic.
2. Immutability and Functional Approach
● Enums can be extended with newconstants without breakingexisting code.● Type-safe approach to managingunit variations.
3. Unit Conversion Reusability
● Leverages the existing conversioninfrastructure from UC5.● Demonstrates how well-designedabstractions reduce redundancyacross features.
4. Normalization to Base Unit
● Converting heterogeneous unitsto a common base unit simplifiesarithmetic.
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 2/12
● Ensures accurate resultsregardless of unit combinations.
5. Precision and Rounding
● Addition of floating-pointconverted values may introducerounding errors.
● Consistent epsilon-basedcomparison ensures predictablebehavior.
6. Type Safety and Validation
● Ensures both operands and thetarget unit are valid beforeperforming arithmetic.
● Prevents silent errors from null orinvalid data.
7. Commutativity and MathematicalProperties
● Addition respects thecommutative property: a + b = b+ a.
● Tests verify that mathematical lawsare preserved in theimplementation.
8. Factory Pattern (Optional)
● The add() method acts as afactory, creating new QuantityLength instances.
● Separates object creation logicfrom business logic.
9. Method Design for Overloading
● add() can be overloaded toaccept different parametercombinations:○ add(QuantityLength,QuantityLength,LengthUnit)
○ add(double, LengthUnit,double, LengthUnit,LengthUnit)
● Provides flexibility for differentuse cases.
10.Error Handling and Edge Cases
● Handles zero values, negativevalues, and large valuesgracefully.● Distinguishes between invalidinputs and legitimate edge cases.
Code Snippet for Length class
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 3/12
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 4/12
Code Snippet for
QuantityMeasurementApp class
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 5/12
Example Output of running the
App
● Input: add(Quantity(1.0, FEET),
Quantity(2.0, FEET))
● Output: Quantity(3.0, FEET)
● Input: add(Quantity(1.0, FEET),
Quantity(12.0, INCHES))
● Output: Quantity(2.0, FEET)
● Input: add(Quantity(12.0, INCHES),
Quantity(1.0, FEET))
● Output: Quantity(24.0, INCHES)
● Input: add(Quantity(1.0, YARDS),
Quantity(3.0, FEET))
● Output: Quantity(2.0, YARDS)
● Input: add(Quantity(36.0, INCHES),
Quantity(1.0, YARDS))
● Output: Quantity(72.0, INCHES)
● Input: add(Quantity(2.54,
CENTIMETERS), Quantity(1.0, INCHES))
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 6/12
● Output: Quantity(~5.08, CENTIMETERS)
● Input: add(Quantity(5.0, FEET),
Quantity(0.0, INCHES))
● Output: Quantity(5.0, FEET)
● Input: add(Quantity(5.0, FEET),
Quantity(-2.0, FEET))
● Output: Quantity(3.0, FEET)
Key Concepts Tested:
1. Same-Unit Addition :
● Two measurements in the sameunit are added correctly.
● Example: 1 foot + 2 feet = 3 feet.
2. Cross-Unit Addition
● Two measurements in differentunits are converted and addedcorrectly.● Example: 1 foot + 12 inches = 2feet (or 24 inches in target unit).
3. Result Precision
● Addition results maintainmathematical accuracy withinfloating-point limits.
● Round-trip conversions preservesum values..
4. Commutativity
● add(A, B, targetUnit) returns thesame result as add(B, A,targetUnit).● Verifies that order does not affectthe sum.
5. Identity Element
● Adding zero to any measurementreturns the same value.● Example: 5 feet + 0 inches = 5feet.
6. Unit Consistency
● The result is always expressed inthe target unit, even if bothoperands are different units.● The unit of the result is always thespecified target unit.
7. Null and Invalid Unit Handling
● Adding measurements with nullunits throws an exception.● Invalid target units result inappropriate error handling.
8. Large and Small Values
● Addition works correctly with verylarge or very small measurements.
● Floating-point precision ismaintained across magnitude
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 7/12
ranges.
Test Case Examples:
1. testAddition_SameUnit_FeetPlusFeet()–
● Add (Quantity(1.0, FEET),Quantity(2.0, FEET)) should returnQuantity(3.0, FEET).● Tests: Same-unit addition withoutconversion.
2. testAddition_SameUnit_InchPlusInch()–
● Add (Quantity(6.0, INCHES),Quantity(6.0, INCHES)) shouldreturn Quantity(12.0, INCHES).
● Tests: Same-unit addition forinches.
3. testAddition_CrossUnit_FeetPlusInches()–
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES)) shouldreturn Quantity(2.0, FEET).● Tests: Cross-unit addition willresult in feet.
4. testAddition_CrossUnit_InchPlusFeet()–
● Add (Quantity(12.0, INCHES),Quantity(1.0, FEET)) should returnQuantity(24.0, INCHES).● Tests: Cross-unit addition withresult in inches.
5. testAddition_CrossUnit_YardPlusFeet()–
● Add (Quantity(1.0, YARDS),Quantity(3.0, FEET)) should returnQuantity(2.0, YARDS).
● Tests: Cross-unit addition withyards conversion.
6. testAddition_CrossUnit_CentimeterPlusInch()–
● Add (Quantity(2.54,CENTIMETERS), Quantity(1.0,INCHES)) should returnQuantity(~5.08, CENTIMETERS)(within epsilon).● Tests: Cross-unit addition withcentimeters.
7. testAddition_Commutativity() –
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES)) shouldequal add(Quantity(12.0,INCHES), Quantity(1.0, FEET)).● Tests: Addition is commutative.
8. testAddition_WithZero() –
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 8/12
● Add (Quantity(5.0, FEET),Quantity(0.0, INCHES)) shouldreturn Quantity(5.0, FEET).
● Tests: Adding zero acts as anidentity element.
9. testAddition_NegativeValues() –
● Add (Quantity(5.0, FEET),Quantity(-2.0, FEET)) shouldreturn Quantity(3.0, FEET).● Tests: Addition with negativemeasurements.
10.testAddition_NullSecondOperand() –
● Add (Quantity(1.0, FEET), null)should throwIllegalArgumentException orNullPointerException.● Tests: Null operand validation.
11.testAddition_LargeValues() –
● Add (Quantity(1e6, FEET),Quantity(1e6, FEET)) shouldreturn Quantity(2e6, FEET).
● Tests: Addition with largemagnitude values.
12.testAddition_SmallValues() –
● Add (Quantity(0.001, FEET),Quantity(0.002, FEET)) shouldreturn Quantity(~0.003, FEET)(within epsilon).
● Tests: Addition with smallmagnitude values.
Code Snippet for Test Case
Samples
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP80… 9/12
UC6 Test Snippet 1.1
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP8… 10/12
UC6 Test Snippet 1.2
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP8… 11/12
UC6 Test Result
Published using Google Docs Report abuse Learn more
UC6: Addition of Two Length Units Updated automatically every 5minutes
19/06/2026, 08:33 UC6: Addition of Two Length Units
https://docs.google.com/document/d/e/2PACX-1vTbHqupF2oIkLiRKxVzNtMnXEA54Ly1DRE0n_VcF08cskRtCREOi31wevpaOnK1lr9bTwPFP8… 12/12


---
# UC7_ Addition with Target Unit Specification(1)

UC7: Addition with TargetUnit Specification
Description
UC7 extends UC6 by providing flexibility inspecifying the unit for the addition result.Instead of defaulting to the unit of the firstoperand, this use case allows the caller toexplicitly specify any supported unit as the targetunit for the result. This provides greaterflexibility in use cases where the result must beexpressed in a specific unit regardless of theoperands' units. For example, adding 1 foot and12 inches with a target unit of yards should yieldapproximately 0.667 yards.
Preconditions
● Quantity Length class (from
UC3/UC4/UC5/UC6) and LengthUnit
enum exist with FEET, INCHES, YARDS,
CENTIMETERS.
● The conversionFactor for each LengthUnit
is defined relative to a consistent base
unit.
● Two Quantity Length objects or raw
values with their respective units are
provided.
● A target unit (distinct or same as operand
units) is explicitly specified.
● All units belong to the same
measurement category (length).
Main Flow
1. Client calls Quantity Length.add(length1,
length2, targetUnit) with an explicit target
unit parameter.
2. The method validates:
● Both length1 and length2 are non-
null and have valid LengthUnits.
● targetUnit is non-null and a valid
LengthUnit.
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 1/11
● All values are finite numbers
(Double.isFinite or equivalent).
3. Convert both length1 and length2 to a
common base unit (feet).
4. Add the converted values.
5. Convert the sum from the base unit to the
explicitly specified targetUnit.
6. Return a new Quantity Length object
representing the result in the target unit.
Postconditions
● A new Quantity Length object is returned
with the sum of the two measurements
expressed in the explicitly specified
target unit.
● The original Quantity Length objects
remain unchanged (immutability
principle).
● The result unit is always the specified
target unit, not inferred from operands.
● Invalid inputs (null units, unsupported
units, NaN, infinite, or mismatched
categories) result in a documented
exception (e.g.,
IllegalArgumentException).
● Addition is mathematically accurate
within floating-point precision limits.
● Addition remains commutative: add(A, B,
targetUnit) equals add(B, A, targetUnit).
Code Snippet for Length Class
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 2/11
Code Snippet for
QuanityMeasurementApp Class
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 3/11
Example Output of running the
App
● Input: add(Quantity(1.0, FEET),
Quantity(12.0, INCHES), FEET) →
Output: Quantity(2.0, FEET)
● Input: add(Quantity(1.0, FEET),
Quantity(12.0, INCHES), INCHES) →
Output: Quantity(24.0, INCHES)
● Input: add(Quantity(1.0, FEET),
Quantity(12.0, INCHES), YARDS) →
Output: Quantity(~0.667, YARDS)
● Input: add(Quantity(1.0, YARDS),
Quantity(3.0, FEET), YARDS) →  Output:
Quantity(2.0, YARDS)
● Input: add(Quantity(36.0, INCHES),
Quantity(1.0, YARDS), FEET) →  Output:
Quantity(6.0, FEET)
● Input: add(Quantity(2.54,
CENTIMETERS), Quantity(1.0, INCHES),
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 4/11
CENTIMETERS) →  Output:
Quantity(~5.08, CENTIMETERS)
● Input: add(Quantity(5.0, FEET),
Quantity(0.0, INCHES), YARDS) →
Output: Quantity(~1.667, YARDS)
● Input: add(Quantity(5.0, FEET),
Quantity(-2.0, FEET), INCHES) →
Output: Quantity(36.0, INCHES)
Concepts Learned byImplementing UC7:
1. Method Overloading
● We used Method Overloading foraddition with target unitspecification. This method allowsadding two QuantityLengthobjects and returning the result ina specified target unit.● Further, by overloading the addmethod, we maintain backwardcompatibility with the existingaddition method that returns theresult in the unit of the firstoperand.
2. Private utility addition method
● Private utility method for additionconversion on base unit value.● This method is used internally bythe add methods to convert thislength and the length to add intothe base unit, sum them up, andconvert the result into the targetunit specified.
● This avoided code duplication inthe addition process by applyingas both the add methods requirethis functionality and ensuresconsistent rounding to twodecimal places across alloperations.● Also maintains immutability byreturning a new QuantityLengthinstance without modifying theoriginal objects.
● We also avoided violation of DRYprinciple for better codemaintainability and readability.
3. API Consistency
● Overloaded add() methodsprovide both implicit (UC6) andexplicit (UC7) target unitspecification.● Both versions coexist to supportdifferent programming styles.
4. Other Concepts to note
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 5/11
● Explicit ParameterPassing: Caller has explicitcontrol over the result unit ratherthan relying on implicit defaults.Improves API clarity and reducesambiguity.
● Flexibility in ResultRepresentation: Same arithmeticoperation can produce results inmultiple units based on callerrequirements. Demonstrates howwell-designed abstractionsaccommodate diverse use cases.
● Unit Independence inArithmetic: Arithmetic operationsare independent of unitrepresentation. Unit conversion isapplied only at input and outputboundaries.
● Precision Across UnitScales: Converting to drasticallydifferent unit scales (e.g., result inyards instead of inches) mayamplify or reduce roundingerrors. Consistent epsilon-basedcomparison ensures accuracyacross all scale conversions.
● Caller Intent Clarity: Explicittarget unit specification makesintent clear in code.Reducesreliance on implicit rules ordocumentation.
● Cross-Category UnitValidation: All units must belongto the same measurementcategory. The system preventsaccidental mixing of incompatibleunits (e.g., feet with kilograms).
● Immutability and Thread-Safety: The New Quantity Lengthobject returned preservesimmutability. Thread-safeoperations across concurrentcallers.
● Conversion Efficiency: Reusesestablished conversioninfrastructure without redundancy.Minimal performance overheadfor flexible unit specification.
5. Functional Programming Paradigm
● Method signature emphasizesinput parameters and return value.● Pure function: same inputs alwaysproduce the same output.
Key Concepts Tested:
1. Explicit Target Unit: Same as FirstOperand :
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 6/11
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES), FEET)returns result in feet.● Verifies that explicit specificationoverrides any implicit defaults.
2. Explicit Target Unit: Same as SecondOperand :
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES),INCHES) returns result in inches.● Tests that second operand's unitcan be used as target
3. Explicit Target Unit: Different fromBoth Operands
● add(Quantity(1.0, FEET),Quantity(12.0, INCHES), YARDS)returns result in yards.● Tests conversion to a third unit notpresent in operands.
4. Target Unit Consistency
● Result unit is always the specifiedtarget unit, never operand units.
● Verifies unit of returned QuantityLength object.
5. Cross-Scale Target Units
● Add (A, B, targetUnit) equalsadd(B, A, targetUnit) for anytarget unit.● Tests that addition respects thecommutative property regardlessof the target unit.
6. Null Target Unit Handling
● Passing null as targetUnit throwsan IllegalArgumentException.
● Test parameter validation.
7. Invalid Target Unit Handling
● Passing an unsupported unit as atarget throws an exception.
● Tests that only valid LengthUnitenum members are accepted.
8. Mathematical Correctness AcrossTarget Units
● The same addition yieldsequivalent results when expressedin different target units.
● Example: add(1 FEET, 12INCHES, FEET) = 2 FEET andadd(1 FEET, 12 INCHES,INCHES) = 24 INCHES.
1. Edge Cases with Target UnitConversion
● Zero value with explicit target unit.
● Negative values with explicittarget units.
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 7/11
● Large values converted to smallerunits (e.g., feet to inches).
Test Case Examples:
1. testAddition_ExplicitTargetUnit_Feet()–
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES), FEET)should return Quantity(2.0, FEET).
● Tests: Explicit target unitspecification in feet.
2. testAddition_ExplicitTargetUnit_Inches()–
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES),INCHES) should returnQuantity(24.0, INCHES).● Tests: Explicit target unitspecification in inches.
3. testAddition_ExplicitTargetUnit_Yards()–
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES), YARDS)should return Quantity(~0.667,YARDS) (within epsilon).
● Tests: Explicit target unitspecification in yards (result unitdifferent from both operands).
4. testAddition_ExplicitTargetUnit_Centimeters()–
● Add (Quantity(1.0, INCHES),Quantity(1.0, INCHES),CENTIMETERS) should returnQuantity(~5.08, CENTIMETERS).● Tests: Explicit target unitspecification in centimeters.
5. testAddition_ExplicitTargetUnit_SameAsFirstOperand()–
● Add (Quantity(2.0, YARDS),Quantity(3.0, FEET), YARDS)should return Quantity(3.0,YARDS).
● Tests: Target unit explicitlymatches first operand unit.
6. testAddition_ExplicitTargetUnit_SameAsSecondOperand()–
● Add (Quantity(2.0, YARDS),Quantity(3.0, FEET), FEET) shouldreturn Quantity(9.0, FEET).
● Tests: Target unit explicitlymatches second operand unit.
7. testAddition_ExplicitTargetUnit_Commutativity()
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 8/11
–
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES), YARDS)should equal add(Quantity(12.0,INCHES), Quantity(1.0, FEET),YARDS).● Tests: Commutativity holds withexplicit target unit.
8. testAddition_ExplicitTargetUnit_WithZero()–
● Add (Quantity(5.0, FEET),Quantity(0.0, INCHES), YARDS)should return Quantity(~1.667,YARDS).● Tests: Zero operand with explicittarget unit conversion.
9. testAddition_ExplicitTargetUnit_NegativeValues()–
● Add (Quantity(5.0, FEET),Quantity(-2.0, FEET), INCHES)should return Quantity(36.0,INCHES).
● Tests: Negative values with explicittarget unit.
10.testAddition_ExplicitTargetUnit_NullTargetUnit()–
● Add (Quantity(1.0, FEET),Quantity(12.0, INCHES), null)should throwIllegalArgumentException.● Tests: Null target unit validation.
11.testAddition_ExplicitTargetUnit_LargeToSmallScale()–
● Add (Quantity(1000.0, FEET),Quantity(500.0, FEET), INCHES)should return Quantity(18000.0,INCHES).
● Tests: Addition with resultconverted to smaller scale unit.
12.testAddition_ExplicitTargetUnit_SmallToLargeScale()–
● Add (Quantity(12.0, INCHES),Quantity(12.0, INCHES), YARDS)should return Quantity(~0.667,YARDS).● Tests: Addition with resultconverted to a larger scale unit.
13.testAddition_ExplicitTargetUnit_AllUnitCombinations()–
● Comprehensive test covering theaddition of all unit pairs withmultiple target units.
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 9/11
● Verifies mathematical correctnessacross all valid combinations.
14.testAddition_ExplicitTargetUnit_PrecisionTolerance()–
● Multiple additions with explicittarget units, verified usingepsilon-based comparison.● Ensures floating-point precision ismaintained across conversions.
Code Snippet for Test Case
Samples
UC7 Test Snippet 1.1
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZe… 10/11
UC7 Test Snippet 1.2
Published using Google Docs Report abuse Learn more
UC7: Addition with Target Unit Specification Updated automatically every 5minutes
19/06/2026, 08:33 UC7: Addition with Target Unit Specification
https://docs.google.com/document/d/e/2PACX-1vQqe-K1bEqXoq63UXG4-38TTGx7ELl1m53MZZucWnXfFIWc2mh5nKCofYi5eYFpd2YciDdZed… 11/11


---
# UC8_ Refactoring Unit Enum to Standalone with Conversion Responsibility(1)

UC8: Refactoring UnitEnum to Standalone withConversion Responsibility
Description
UC8 refactors the design from UC1–UC7 toovercome the disadvantage of embedding theLengthUnit enum within the QuantityLength class.This design flaw creates circular dependencieswhen scaling to multiple measurement categories(length, weight, volume, etc.) and violates theSingle Responsibility Principle by not centralizingunit-related conversion logic.
UC8 extracts the LengthUnit enum into astandalone, top-level class and assigns it theresponsibility of managing conversions to andfrom the base unit. The QuantityLength class issimplified to delegate conversion logic to the unititself, improving cohesion, reducing coupling, andestablishing a scalable pattern for additionalmeasurement categories.
This refactoring maintains all functionality fromUC1–UC7 while establishing architectural patternsthat support seamless integration of newmeasurement types in future use cases.
Preconditions
● The QuantityMeasurementApp class is
instantiated with the refactored design from
UC1–UC7.
● Two numerical values with their respective
unit types (feet, inches, yards, centimeters)
are provided for comparison, conversion,
or arithmetic operations.
● The LengthUnit enum exists as a
standalone class with responsibility for
unit-specific conversion logic.
● Conversion factors between supported
length units are defined as constants within
LengthUnit.
● All existing functionality from UC1–UC7
continues to work without modification to
client code.
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 1/17
Main Flow
1. Enum Refactoring:
● Move LengthUnit from inside
QuantityLength to a standalone top-
level class.
● Add conversion responsibility to
LengthUnit: methods to convert
from base unit and to base unit.
2. Unit Conversion Logic:
● Implement
convertToBaseUnit(double value)
method in LengthUnit to convert a
value in this unit to feet (base unit).
● Implement
convertFromBaseUnit(double
baseValue) method in LengthUnit
to convert a base unit value (feet) to
this unit.
3. QuantityLength Simplification:
● Remove internal conversion logic
from QuantityLength.
● Delegate all conversion operations
to the unit's conversion methods.
● QuantityLength now focuses solely
on value comparison and arithmetic
logic.
4. Backward Compatibility:
● All existing test cases from UC1–
UC7 pass without modification.
● Client code continues to work with
the same public API.
5. Scalability Pattern:
● The refactored design establishes a
pattern for future measurement
categories.
● New units (WeightUnit,
VolumeUnit, TemperatureUnit) can
follow the same extraction and
responsibility pattern.
Postconditions
● LengthUnit is now a standalone enum with
full responsibility for unit conversions.
● QuantityLength is simplified and focused
on value comparison and arithmetic
operations.
● Circular dependency risk is eliminated by
separating enum and quantity classes.
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 2/17
● Single Responsibility Principle is upheld:
LengthUnit handles conversions,
QuantityLength handles
comparisons/arithmetic.
● All equality, conversion, and addition
operations from UC1–UC7 work
identically.
● The architectural pattern supports
straightforward addition of new
measurement categories without
refactoring existing code.
● Code cohesion is improved; unit-specific
logic is centralized in the unit class.
HINTS FOR IMPLEMENTING
UC8:
Step 1 – Extract LengthUnit as a Standalone Enum
Class
● Move LengthUnit from inside
QuantityLength to a top-level class.
● Maintain all existing enum constants
(FEET, INCHES, YARDS,
CENTIMETERS) with their conversion
factors.
● Ensure the enum file is in the same
package or appropriate location for
visibility.
● New responsibility 1: Convert value in this
unit to feet (base unit)
● New responsibility 2: Convert value from
feet (base unit) to this unit
Step 2 – Refactor QuantityLength to Use
Standalone LengthUnit
● Remove all internal conversion logic from
QuantityLength.
● Update all conversion operations to
delegate to unit methods.
● Simplify the class to focus on equality and
arithmetic.
Step 3 – Refactor All References in
QuantityMeasurement App
● Ensure all imports reference the standalone
LengthUnit.
● Update any factory methods or static
helpers to use the new structure.
● Verify no code assumes LengthUnit is
nested within QuantityLength.
Step 4 –Maintain Backward Compatibility
● The public API of QuantityLength remains
unchanged.
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 3/17
● Client code using QuantityLength
continues to work without modification.
● All method signatures and behavior are
preserved.
Step 5 – Verify All Test Cases
● Run all test cases from UC1–UC7 to
ensure they pass without modification.
● Verify that conversion, equality, and
addition operations work identically.
● Confirm that the refactoring introduces no
regressions.
Code Snippet
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 4/17
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 5/17
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 6/17
Example Output of running the
App
● Input: Quantity(1.0,
FEET).convertTo(INCHES) → Output:
Quantity(12.0, INCHES)
● Input: Quantity(1.0,
FEET).add(Quantity(12.0, INCHES),
FEET) → Output: Quantity(2.0, FEET)
● Input: Quantity(36.0,
INCHES).equals(Quantity(1.0, YARDS))
→ Output: true
● Input: Quantity(1.0,
YARDS).add(Quantity(3.0, FEET),
YARDS) → Output: Quantity(2.0,
YARDS)
● Input: Quantity(2.54,
CENTIMETERS).convertTo(INCHES) →
Output: Quantity(~1.0, INCHES) (within
epsilon)
● Input: Quantity(5.0,
FEET).add(Quantity(0.0, INCHES), FEET)
→ Output: Quantity(5.0, FEET)
● Input:
LengthUnit.FEET.convertToBaseUnit(12.0)
→ Output: 12.0 (already in base unit)
● Input:
LengthUnit.INCHES.convertToBaseUnit(12.0)
→ Output: 1.0 (converted to feet)
Concepts Learned by ImplementingUC7:
1. Single Responsibility Principle (SRP)
● Each class has a single, well-defined responsibility.
● LengthUnit is responsible for unitconversions.
● QuantityLength is responsible forvalue comparison and arithmetic.● Clear separation improvesmaintainability and testability.
2. Separation of Concerns
● Unit-specific logic is isolated in theLengthUnit enum.
● Domain logic (comparison,arithmetic) is isolated inQuantityLength.
● Changes to conversion logic do notaffect QuantityLength and vice
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 7/17
versa.
3. Dependency Inversion
● QuantityLength depends on theabstraction (LengthUnitinterface/enum) rather thanconcrete implementation.
● Units can be extended withoutmodifying QuantityLength.● Promotes loose coupling and highcohesion.
4. Circular Dependency Elimination
● Extracting LengthUnit preventscircular references in multi-category designs.● Future WeightUnit, VolumeUnit,etc., can coexist without circulardependencies.● Cleaner architecture scales todozens of measurement categories.
5. Cohesion in Unit Class
● All unit-related operations(conversion, factors) are in oneplace.● LengthUnit is responsible forknowing how to convert betweenunits.● Adding new units or conversionmethods requires changes only toLengthUnit.
6. Scalability Pattern Establishment
● The refactored design serves as atemplate for new measurementcategories.● Each category gets its own Unitenum (WeightUnit, VolumeUnit,etc.) with conversion responsibility.● Quantity classes for each categoryfollow the same pattern.
7. Delegation Pattern
● QuantityLength delegatesconversion responsibility to theunit.● Method calls likeunit.convertToBaseUnit()encapsulate unit-specific logic.● Improves code clarity and reducescomplexity in QuantityLength.
8. Encapsulation of Conversion Logic
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 8/17
● Conversion formulas areencapsulated within unit methods.
● External classes need not knowhow conversions are calculated.
● Internal implementation can beoptimized without affecting clients.
9. Type Safety and Design Pattern
● Enum usage provides compile-timetype safety for unit constants.
● Prevents invalid unit values fromentering the system.
● Design pattern is reusable across allmeasurement categories.
10.Refactoring Best Practices
● Functionality is preserved whileimproving internal structure.
● Backward compatibility ismaintained for client code.
● Incremental refactoring reducesrisk and simplifies testing.
11.Java Enum Capabilities
● Enums can encapsulate data(conversion factors) and behavior(conversion methods).● Enums are inherently immutableand thread-safe.● Enums support method overridingand custom business logic.
12.Architectural Scalability
● The extracted design patternfacilitates integration of multiplemeasurement categories.
● Prevents code duplication acrossdifferent Quantity types.
● Establishes a foundation forenterprise-grade measurementsystems
Key Concepts Tested:
1. Standalone LengthUnit Enum
● LengthUnit is accessible as a top-level class.● Constants (FEET, INCHES,YARDS, CENTIMETERS) areavailable globally.● Conversion factors are correctlydefined and retrievable.
2. Base Unit Conversion Method
● LengthUnit.FEET.convertToBaseUnit(value)
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 9/17
correctly converts feet to feet(returns unchanged).● LengthUnit.INCHES.convertToBaseUnit(12.0)returns 1.0 (feet).● LengthUnit.YARDS.convertToBaseUnit(1.0)returns 3.0 (feet).● LengthUnit.CENTIMETERS.convertToBaseUnit(30.48)returns 1.0 (feet).
3. From Base Unit Conversion Method
● LengthUnit.FEET.convertFromBaseUnit(2.0)returns 2.0.● LengthUnit.INCHES.convertFromBaseUnit(1.0)returns 12.0.● LengthUnit.YARDS.convertFromBaseUnit(3.0)returns 1.0.● LengthUnit.CENTIMETERS.convertFromBaseUnit(1.0)returns 30.48.
4. QuantityLength Simplification
● QuantityLength no longer containsconversion logic.● All conversion operations delegateto unit methods.● No circular references or tightcoupling.
5. Backward Compatibility
● All UC1–UC7 test cases passunchanged.
● Equality, conversion, and additionoperations work identically.● Client code requires nomodifications.
6. Equality Operations
● equals() method correctly delegatesto unit.convertToBaseUnit().
● Cross-unit equality works as before.● All equality contracts (reflexive,symmetric, transitive) arepreserved.
7. Conversion Operations
● convertTo() method correctly usesunit.convertToBaseUnit() andunit.convertFromBaseUnit().● Results match expected values andare rounded to two decimal places.
● Round-trip conversions preservevalues within epsilon tolerance.
8. Addition Operations
● add() method correctly convertsoperands to base units, sums them,and converts results.● Works with explicit target unitspecification (UC7 equivalent).
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 10/17
● Commutativity and othermathematical properties aremaintained.
9. Unit Independence
● Adding new LengthUnit constantsrequires changes only toLengthUnit enum.● No changes to QuantityLength areneeded for new units.
● Scalability is significantlyimproved.
10.Type Safety
● Null unit validation throwsappropriate exceptions.● - Invalid input values (NaN,infinite) are rejected.
● - Only valid LengthUnit enummembers are accepted.
11.Encapsulation
● Conversion formula internals arehidden within LengthUnit methods.● External classes interact throughpublic API only.● Internal implementation can beoptimized independently.
12.Architectural Readiness for MultipleCategories
● Design pattern established forextracting future unit enums.
● WeightUnit, VolumeUnit, etc., canfollow the same structure.● No circular dependencies orcoupling between category types.
Test Case Examples:
1. testLengthUnitEnum_FeetConstant() – 
● Verifies that LengthUnit.FEET isaccessible and has correctconversion factor 1.0.
● Tests:LengthUnit.FEET.getConversionFactor()returns 1.0.
2. testLengthUnitEnum_InchesConstant()–
● Verifies that LengthUnit.INCHES isaccessible and has the correctconversion factor (1/12).● Tests:LengthUnit.INCHES.getConversionFactor()returns ~0.0833.
3. testLengthUnitEnum_YardsConstant() – 
● Verifies that LengthUnit.YARDS isaccessible and has correctconversion factor 3.0.● Tests:LengthUnit.YARDS.getConversionFactor()
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 11/17
returns 3.0.
4. testLengthUnitEnum_CentimetersConstant()– 
● Verifies thatLengthUnit.CENTIMETERS isaccessible and has correctconversion factor (1/30.48).● Tests:LengthUnit.CENTIMETERS.getConversionFactor()returns ~0.0328.
5. testConvertToBaseUnit_FeetToFeet() – 
● Verifies thatLengthUnit.FEET.convertToBaseUnit(5.0)returns 5.0.● Tests: Conversion to base unit whenalready in base unit.
6. testConvertToBaseUnit_InchesToFeet()– 
● Verifies thatLengthUnit.INCHES.convertToBaseUnit(12.0)returns 1.0.● Tests: Conversion from inches tofeet (base unit).
7. testConvertToBaseUnit_YardsToFeet() – 
● Verifies thatLengthUnit.YARDS.convertToBaseUnit(1.0)returns 3.0.● Tests: Conversion from yards tofeet (base unit).
8. testConvertToBaseUnit_CentimetersToFeet()–
● Verifies thatLengthUnit.CENTIMETERS.convertToBaseUnit(30.48)returns ~1.0.● Tests: Conversion from centimetersto feet (base unit), within epsilon.
9. testConvertFromBaseUnit_FeetToFeet()– 
● Verifies thatLengthUnit.FEET.convertFromBaseUnit(2.0)returns 2.0.● Tests: Conversion from base unit(feet) to feet.
10.testConvertFromBaseUnit_FeetToInches()– 
● Verifies thatLengthUnit.INCHES.convertFromBaseUnit(1.0)returns 12.0.● Tests: Conversion from base unit(feet) to inches.
11.testConvertFromBaseUnit_FeetToYards()– 
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 12/17
● Verifies thatLengthUnit.YARDS.convertFromBaseUnit(3.0)returns 1.0.
● Tests: Conversion from base unit(feet) to yards.
12.testConvertFromBaseUnit_FeetToCentimeters()–
● Verifies thatLengthUnit.CENTIMETERS.convertFromBaseUnit(1.0)returns ~30.48.● Tests: Conversion from base unit(feet) to centimeters, within epsilon.
13.testQuantityLengthRefactored_Equality()– 
● Verifies that Quantity(1.0,FEET).equals(Quantity(12.0,INCHES)) returns true.● Tests: Refactored QuantityLengthcorrectly uses unit conversionmethods.
14.testQuantityLengthRefactored_ConvertTo()– 
● Verifies that Quantity(1.0,FEET).convertTo(INCHES) returnsQuantity(12.0, INCHES).
● Tests: Refactored convertTo()correctly delegates to unit methods.
15.testQuantityLengthRefactored_Add()– 
● Verifies that Quantity(1.0,FEET).add(Quantity(12.0,INCHES), FEET) returnsQuantity(2.0, FEET).
● Tests: Refactored add() correctlyuses unit conversion methods.
16.testQuantityLengthRefactored_AddWithTargetUnit()– 
● Verifies that Quantity(1.0,FEET).add(Quantity(12.0,INCHES), YARDS) returnsQuantity(~0.667, YARDS).
● Tests: Refactored add() withexplicit target unit specification.
17.testQuantityLengthRefactored_NullUnit()– 
● Verifies that Quantity(1.0, null)throws IllegalArgumentException.● Tests: Null unit validation inrefactored QuantityLength.
18.testQuantityLengthRefactored_InvalidValue()–
● Verifies that Quantity(Double.NaN,FEET) throws
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 13/17
IllegalArgumentException.● Tests: Invalid value validation inrefactored QuantityLength.
19.testBackwardCompatibility_UC1EqualityTests()– 
● Runs all UC1 test cases; verifiesthey pass without modification.● Tests: UC1 test case compatibilitywith refactored design.
20.testBackwardCompatibility_UC5ConversionTests()– 
● Runs all UC5 conversion test cases;verifies they pass withoutmodification.
● Tests: UC5 test case compatibilitywith refactored design.
21.testBackwardCompatibility_UC6AdditionTests()– 
● Runs all UC6 addition test cases;verifies they pass withoutmodification.
● Tests: UC6 test case compatibilitywith refactored design.
22.testBackwardCompatibility_UC7AdditionWithTargetUnitTests()– 
● Runs all UC7 addition-with-target-unit test cases; verifies they passwithout modification.
● Tests: UC7 test case compatibilitywith refactored design.
23.testArchitecturalScalability_MultipleCategories()–
● Confirms that the refactored patterncan be replicated for WeightUnitwithout coupling to LengthUnit.
● Tests: Architecture supportsmultiple measurement categorieswithout circular dependencies.
24.testRoundTripConversion_RefactoredDesign()– 
● Verifies that convert(convert(value,A, B), B, A) ≈ value usingrefactored unit methods.
● Tests: Refactored design maintainsmathematical precision acrossround-trip conversions.
25.testUnitImmutability() – 
● Verifies that LengthUnit enumconstants are immutable and thread-safe.
● Tests: Enum design preventsmodification of unit definitions at
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 14/17
runtime.
Code Snippet for Test Cases
UC8 Test Snippet 1.1
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 15/17
UC8 Test Snippet 1.2
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 16/17
UC8 Test Snippet 1.3
Published using Google Docs Report abuse Learn more
UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility Updated automatically every 5minutes
19/06/2026, 08:34 UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility
https://docs.google.com/document/d/e/2PACX-1vQlR-5pkI2Mryg9ofPnNVYfv3SgYSgXzXvVoa5SfdNPvhz6bZFjIxRAbU1Ne5anib0GnAgp6sHss… 17/17


---
# UC9_ Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)(1)

UC9: Weight MeasurementEquality, Conversion, andAddition (Kilogram, Gram,Pound)
Description
UC9 extends the Quantity MeasurementApplication to support weight measurementsalongside length measurements. This use caseintroduces a new measurement category—weight—that operates independently from length. Similarto how length measurements (feet, inches, yards,centimeters) are compared for equality, convertedbetween units, and added together, weightmeasurements in different units (kilograms, grams,pounds) will support the same operations.
The application will support three weight units:
● Kilogram (kg): Base unit for weightconversions
● Gram (g): 1 kg = 1000 g● Pound (lb): 1 lb ≈ 0.453592 kg
UC9 demonstrates that the generic design patternsestablished in UC1–UC8 scale seamlessly tomultiple measurement categories. The WeightUnitenum and QuantityWeight class mirror theLengthUnit and QuantityLength design,reinforcing consistency and maintainability acrossthe application.
Preconditions
● The QuantityMeasurementApp class is
instantiated.
● Two or more numerical values with their
respective weight unit types (kilogram,
gram, pound) are provided for comparison,
conversion, or addition.
● The conversion factors between supported
weight units are defined as constants
relative to kilogram (base unit).
● The WeightUnit enum exists as a
standalone class with conversion
responsibility (mirroring UC8 refactoring
for LengthUnit).
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 1/24
● Length functionality from UC1–UC8
remains fully operational and unaffected.
● Weight and length measurements are
treated as separate, incomparable
categories.
Main Flow
1. Equality Comparison:
● User inputs two numerical values
with their respective weight unit
types.
● QuantityWeight class validates the
input values to ensure they are
numeric and units are valid.
● Both values are converted to the
common base unit (kilogram) using
WeightUnit conversion methods.
● The converted values are compared
for equality using the overridden
equals() method.
● The result of the comparison (true
or false) is returned.
2. Unit Conversion:
● User inputs a numerical value,
source unit, and target unit.
●
QuantityWeight.convertTo(targetUnit)
converts the measurement to the
target unit.
● The method normalizes through the
base unit (kilogram) and applies
appropriate conversion factors.
● A new QuantityWeight object is
returned with the converted value
and target unit.
3. Addition Operations:
● User inputs two QuantityWeight
objects and optionally a target unit.
● Both measurements are converted
to the base unit (kilogram).
● The converted values are summed.
● The result is converted to the target
unit (either first operand's unit or
explicitly specified unit).
● A new QuantityWeight object
representing the sum is returned.
Postconditions
● Weight measurements of the same unit and
value are considered equal.
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 2/24
● Weight measurements of different units but
equivalent values are considered equal
(e.g., 1 kg = 1000 g = 2.20462 lb).
● Unit conversions between weight units
produce mathematically accurate results
within floating-point precision.
● Addition of two weight measurements
produces a new QuantityWeight object
without modifying originals
(immutability).
● All previous functionality from UC1–UC8
for length measurements is preserved and
works correctly.
● Length and weight measurements are
treated as separate, incomparable
categories (1 foot ≠ 1 kilogram).
● The architectural pattern established
supports straightforward addition of new
measurement categories (temperature,
volume, etc.).
HINTS FOR IMPLEMENTING
UC9:
Step 1 – Create a Standalone WeightUnit Enum
● Define an enum with weight units
(KILOGRAM, GRAM, POUND).
● Assign conversion factors relative to the
base unit (kilogram):
○ KILOGRAM: 1.0
○ GRAM: 0.001 (1 g = 0.001 kg)
○ POUND: 0.453592 (1 lb ≈
0.453592 kg)
● Implement methods:
○ getConversionFactor() - returns the
conversion factor
○ convertToBaseUnit(double value) -
converts value to kilograms
○ convertFromBaseUnit(double
baseValue) - converts from
kilograms to this unit
Step 2 – Implement QuantityWeight Class
● Mirror the design of QuantityLength with
WeightUnit enum.
● Include private final fields for value and
unit.
● Implement validation in the constructor:
○ Ensure unit is not null
○ Ensure value is a finite number (not
NaN or infinite)
● Implement equals() method:
○ Convert both weights to kilogram
(base unit) before comparison
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 3/24
○ Use Double.compare() for accurate
floating-point comparison
○ Handle null and type checking
● Implement convertTo() method:
○ Validate target unit is not null
○ Delegate to WeightUnit conversion
methods
○ Return new QuantityWeight object
(immutability)
● Implement add() methods (overloaded):
○ add(QuantityWeight,
QuantityWeight) - result in first
operand's unit
○ add(QuantityWeight,
QuantityWeight, WeightUnit) -
result in specified target unit
○ Use private helper method for base
unit arithmetic
● Override toString() for readable output
Step 3 – Implement Category Type Safety
● Ensure QuantityWeight and
QuantityLength cannot be compared
directly.
● The equals() method checks getClass() !=
obj.getClass() to reject cross-category
comparisons.
● Documentation clarifies that weight and
length are incompatible.
Step 4 –Ensure Conversion Accuracy
● Verify conversion factor precision:
○ 1 kg = 1000 g (exact)
○ 1 lb ≈ 0.453592 kg (standard
conversion)
○ 1 kg ≈ 2.20462 lb (inverse of
above)
● Test round-trip conversions maintain
values within epsilon (1e-6).
Step 5 – Test Coverage
● Ensure comprehensive test cases cover:
○ Kilogram-to-kilogram, gram-to-
gram, pound-to-pound equality
○ Cross-unit weight equality (kg ↔ g,
kg ↔ lb, g ↔ lb)
○ Conversion between all unit pairs
○ Addition with same and different
units
○ Addition with explicit target unit
specification
○ Weight vs. length incompatibility
○ Null handling, invalid inputs, edge
cases (zero, negative, large values)
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 4/24
Code Snippet
UC9 Code Snippet 1.1 WeightUnit Class
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 5/24
UC9 Code Snippet 1.2 WeightUnit Class
UC9 Code Snippet 2.1 Weight Class
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 6/24
UC9 Code Snippet 2.2 Weight Class
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 7/24
UC9 Code Snippet 2.3 Weight Class
UC9 Code Snippet 2.4 Weight Class
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 8/24
UC9 Code Snippet 3.1 QuantityMeasurementApp
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjnH… 9/24
UC9 Code Snippet 3.2 QuantityMeasurementApp
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 10/24
UC9 Code Snippet 3.3 QuantityMeasurementApp
UC9 Code Snippet 4.1 QuantityMeasurementTest
Samples
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 11/24
UC9 Code Snippet 4.2 QuantityMeasurementTest
Samples
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 12/24
UC9 Code Snippet 4.3 QuantityMeasurementTest
Samples
Example Output of running the
App
Equality Comparisons:
● Input: Quantity(1.0,
KILOGRAM).equals(Quantity(1.0,
KILOGRAM)) → Output: true
● Input: Quantity(1.0,
KILOGRAM).equals(Quantity(1000.0,
GRAM)) → Output: true
● Input: Quantity(2.0,
POUND).equals(Quantity(2.0, POUND))
→ Output: true
● Input: Quantity(1.0,
KILOGRAM).equals(Quantity(~2.20462,
POUND)) → Output: true (within epsilon)
● Input: Quantity(500.0,
GRAM).equals(Quantity(0.5,
KILOGRAM)) → Output: true
● Input: Quantity(1.0,
POUND).equals(Quantity(~453.592,
GRAM)) → Output: true (within epsilon
Unit Conversions:
● Input: Quantity(1.0,
KILOGRAM).convertTo(GRAM) →
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 13/24
Output: Quantity(1000.0, GRAM)
● Input: Quantity(2.0,
POUND).convertTo(KILOGRAM) →
Output: Quantity(~0.907184,
KILOGRAM)
● Input: Quantity(500.0,
GRAM).convertTo(POUND) → Output:
Quantity(~1.10231, POUND)
● Input: Quantity(0.0,
KILOGRAM).convertTo(GRAM) →
Output: Quantity(0.0, GRAM)
Addition Operations (Implicit Target Unit):
● Input: Quantity(1.0,
KILOGRAM).add(Quantity(2.0,
KILOGRAM)) → Output: Quantity(3.0,
KILOGRAM)
● Input: Quantity(1.0,
KILOGRAM).add(Quantity(1000.0,
GRAM)) → Output: Quantity(2.0,
KILOGRAM)
● Input: Quantity(500.0,
GRAM).add(Quantity(0.5, KILOGRAM))
→ Output: Quantity(1000.0, GRAM)
Addition Operations (Explicit Target Unit):
● Input: Quantity(1.0,
KILOGRAM).add(Quantity(1000.0,
GRAM), GRAM) → Output:
Quantity(2000.0, GRAM)
● Input: Quantity(1.0,
POUND).add(Quantity(453.592, GRAM),
POUND) → Output: Quantity(~2.0,
POUND)
● Input: Quantity(2.0,
KILOGRAM).add(Quantity(4.0, POUND),
KILOGRAM) → Output: Quantity(~3.82,
KILOGRAM)
Category Incompatibility:
● Input: Quantity(1.0,
KILOGRAM).equals(Quantity(1.0,
FOOT)) → Output: false (or exception)
Concepts Learned by ImplementingUC9:
1. Multiple Measurement Categories
● Quantity system extends beyond asingle category (length) toaccommodate multiple types(weight).
● Each category maintainsindependent unit definitions andconversion logic.
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 14/24
● Categories are type-safe and non-interoperable.
2. Scalable Generic Design Patterns
● WeightUnit and QuantityWeightmirror LengthUnit andQuantityLength design.
● Pattern is replicable fortemperature, volume, time, andother categories.
● Consistency across categoriesreduces cognitive load andmaintenance burden.
3. Category Type Safety
● Weight and length are distinct typesthat cannot be interchanged orcompared.
● Compile-time type checkingthrough class hierarchy preventslogical errors.● Runtime validation in equals()method rejects cross-categorycomparisons.
4. Base Unit Normalization AcrossCategories
● Kilogram is chosen as the base unitfor weight conversions (mirroringfeet for length).● Centralized normalization throughWeightUnit methods simplifies alloperations.
● Consistent pattern establishesprecedent for future categories.
5. Conversion Factor Precision
● Weight conversion factors must beaccurate (e.g., 0.453592 forpounds).● Precision directly impacts equalityand addition accuracy across units.● Epsilon-based toleranceaccommodates floating-pointrounding.
6. Enum-Based Responsibility Assignment
● WeightUnit encapsulatesconversion logic, following UC8principles.● QuantityWeight focuses oncomparison and arithmetic, notconversions.● Clear separation of concernsimproves maintainability.
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 15/24
7. Immutability Across Categories
● QuantityWeight objects areimmutable (value and unit arefinal).● Thread-safe operations acrossconcurrent callers.● Addition and conversion return newinstances rather than modifyingoriginals.
8. Equals and HashCode Contract
● Both equals() and hashCode() mustbe consistently overridden.
● Objects that are equal must have thesame hash code for propercollection behavior.
● Enables use in sets, maps, and otherhash-based collections.
9. Method Overloading for Flexibility
● add() is overloaded to supportimplicit (UC6-equivalent) andexplicit (UC7-equivalent) targetunit specification.
● Both versions coexist withoutconflict.
● Backward compatibility ismaintained while providingflexibility.
10.Arithmetic on Value Objects
● Value objects (QuantityWeight) canencapsulate domain operations(addition, conversion).
● Demonstrates functional approach:operations return new objects ratherthan mutating state.
● Supports chaining and compositionof operations.
11.Floating-Point Precision Consistency
● Different unit scales requireconsistent epsilon-basedcomparison.
● Kilogram to pound conversionsmay involve different precisionrequirements than gram tokilogram.● Standardized rounding (twodecimal places) ensurespredictability.
12.Architectural Scalability Validation
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 16/24
● UC9 validates that the design fromUC1–UC8 truly scales to multiplecategories.● No modifications toQuantityLength, LengthUnit, orcore application are needed.● Demonstrates that patterns arereusable and extensible.
Key Concepts Tested:
1. Kilogram-to-Kilogram Equality
● Two measurements in kilogramswith the same value are equal.● Verifies baseline equality for weightmeasurements.
2. Gram-to-Gram Equality
● Two measurements in grams withthe same value are equal.
● Tests within-unit equality for grammeasurements.
3. Pound-to-Pound Equality
● Two measurements in pounds withthe same value are equal.● Tests within-unit equality for poundmeasurements.
4. Cross-Unit Weight Equality (Kilogramto Gram)
● 1 kilogram equals 1000 grams.● Tests conversion accuracy betweenmetric units.
5. Cross-Unit Weight Equality (Kilogramto Pound)
● 1 kilogram approximately equals2.20462 pounds.● Tests conversion accuracy betweenmetric and imperial units.
6. Cross-Unit Weight Equality (Gram toPound)
● 453.592 grams approximatelyequals 1 pound.
● Tests multi-step conversion throughthe base unit.
7. Weight vs. Length Incompatibility
● Comparing a weight measurementwith a length measurement returnsfalse or throws an exception.● Verifies category type safety.
8. Unit Conversion Accuracy
● Conversions between all weightunit pairs produce mathematicallycorrect results.● Round-trip conversions preservevalues within epsilon tolerance.
9. Symmetric Equality
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 17/24
● If A equals B, then B equals A(commutative property).
● Tests bidirectional conversionaccuracy.
10.Transitive Equality
● If A equals B and B equals C, thenA equals C.● Tests that conversion logicmaintains mathematical properties.
11.Addition with Same Units
● Two weights in the same unit sumcorrectly.● Result is in the unit of the firstoperand (default behavior)
12.Addition with Different Units
● Two weights in different units areconverted and summed correctly.
● Result is in the unit of the firstoperand (default behavior)
13.Addition with Explicit Target Unit
● Sum can be expressed in anysupported weight unit.
● Explicit target unit overrides defaultbehavior.
14.Addition Commutativity
● Add (A, B, targetUnit) equalsadd(B, A, targetUnit).● Tests that order does not affect thesum.
15.Null Handling
● Comparing with null returns falseor throws an exception.● Null units are rejected withvalidation errors.
16.Same Reference Equality
● A weight object equals itself(reflexive property).
● Tests object identity comparison.
17.Precision and Rounding
● Cross-unit conversions maintainaccuracy within floating-pointepsilon tolerance.
● Consistent rounding behavioracross all conversions.
18.From Base Unit Conversion Method
● 1 kilogram does not equal 2kilograms.● Tests inequality detection.
19.Invalid Unit Handling
● Unsupported units are rejected withappropriate exceptions.● Tests unit validation logic.
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 18/24
20.Invalid Unit Handling
● Weight objects can be stored in setsand maps with consistent hashing.
● Tests hashCode() consistency withequals().
21.Edge Cases (Zero, Negative, LargeValues)
● Conversions and additions workcorrectly with zero, negative, andlarge magnitude values.● Floating-point precision ismaintained across all ranges.
22.WeightUnit Enum Methods
● convertToBaseUnit() andconvertFromBaseUnit() methodsfunction correctly.
● Enum constants are immutable andthread-safe.
Test Case Examples:
1. testEquality_KilogramToKilogram_SameValue()– 
● Verifies that Quantity(1.0,KILOGRAM).equals(Quantity(1.0,KILOGRAM)) returns true.● Tests: equals() returns true foridentical kilogram measurements.
2. testEquality_KilogramToKilogram_DifferentValue()–
● Verifies that Quantity(1.0,KILOGRAM).equals(Quantity(2.0,KILOGRAM)) returns false.
● Tests: equals() returns false fordifferent kilogram measurements.
3. testEquality_KilogramToGram_EquivalentValue()– 
● Verifies that Quantity(1.0,KILOGRAM).equals(Quantity(1000.0,GRAM)) returns true.
● Tests: equals() returns true forkilogram-to-gram conversion.
4. testEquality_GramToKilogram_EquivalentValue()– 
● Verifies that Quantity(1000.0,GRAM).equals(Quantity(1.0,KILOGRAM)) returns true.
● Tests: equals() returns true (testssymmetry of conversion).
5. testEquality_WeightVsLength_Incompatible()– 
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 19/24
● Verifies that Quantity(1.0,KILOGRAM).equals(Quantity(1.0,FOOT)) returns false.●  Tests: equals() returns false whencomparing incompatiblemeasurement categories.
6. testEquality_NullComparison() – 
● Verifies that Quantity(1.0,KILOGRAM).equals(null) returnsfalse.●  Tests: equals() returns false whencomparing with null.
7. testEquality_SameReference()–
● Verifies that a weight object equalsitself (reflexive property).●  Tests: equals() returns true whencomparing an object with itself.
8. testEquality_NullUnit()– 
● Verifies that Quantity(1.0, null)throws IllegalArgumentException.
● Tests: Exception thrown for nullunit in constructor.
9. testEquality_TransitiveProperty() – 
● Verifies transitive property: if Aequals B and B equals C, then Aequals C.● Example: Quantity(1.0,KILOGRAM) equalsQuantity(1000.0, GRAM) andQuantity(1000.0, GRAM) equalsQuantity(1.0, KILOGRAM),therefore Quantity(1.0,KILOGRAM) equals Quantity(1.0,KILOGRAM).
10.testEquality_ZeroValue() – 
● Verifies that Quantity(0.0,KILOGRAM).equals(Quantity(0.0,GRAM)) returns true.● Tests: Zero values are consideredequal across units.
11.testEquality_NegativeWeight() – 
● Verifies that Quantity(-1.0,KILOGRAM).equals(Quantity(-1000.0,GRAM)) returns true.● Tests: Negative weight values arehandled correctly in conversions.
12.testEquality_LargeWeightValue() –
● Verifies that Quantity(1000000.0,GRAM).equals(Quantity(1000.0,KILOGRAM)) returns true.
● Tests: Large magnitude valuesmaintain precision acrossconversions.
13.testEquality_SmallWeightValue() – 
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 20/24
● Verifies that Quantity(0.001,KILOGRAM).equals(Quantity(1.0,GRAM)) returns true.● Tests: Small magnitude valuesmaintain precision acrossconversions.
14.testConversion_PoundToKilogram() – 
● Verifies that Quantity(2.20462,POUND).convertTo(KILOGRAM)returns Quantity(~1.0,KILOGRAM) (within epsilon).
● Tests: Conversion from pound tokilogram.
15.testConversion_KilogramToPound() – 
● Verifies that Quantity(1.0,KILOGRAM).convertTo(POUND)returns Quantity(~2.20462,POUND) (within epsilon).
● Tests: Conversion from kilogram topound.
16.testConversion_SameUnit() – 
● Verifies that Quantity(5.0,KILOGRAM).convertTo(KILOGRAM)returns Quantity(5.0,KILOGRAM).
● Tests: Converting to the same unitreturns unchanged value.
17.testConversion_ZeroValue()–
● Verifies that Quantity(0.0,KILOGRAM).convertTo(GRAM)returns Quantity(0.0, GRAM).● Tests: Zero value conversion acrossunits.
18.testConversion_NegativeValue()– 
● Verifies that Quantity(-1.0,KILOGRAM).convertTo(GRAM)returns Quantity(-1000.0, GRAM).● Tests: Negative weight conversionpreserves sign.
19.testConversion_RoundTrip() – 
● Verifies that Quantity (1.5,KILOGRAM).convertTo(GRAM).convertTo(KILOGRAM) returnsQuantity(~1.5, KILOGRAM)(within epsilon).● Tests: Round-trip conversionspreserve value within floating-pointtolerance.
20.testAddition_SameUnit_KilogramPlusKilogram()– 
● Verifies that Quantity(1.0,KILOGRAM).add(Quantity(2.0,KILOGRAM)) returnsQuantity(3.0, KILOGRAM).● Tests: Same-unit addition withoutconversion.
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 21/24
21.testAddition_CrossUnit_KilogramPlusGram()– 
● Verifies that Quantity(1.0,KILOGRAM).equals(Quantity(1.0,KILOGRAM)) returns true.● Tests: equals() returns true foridentical kilogram measurements.
22.testLengthUnitEnum_InchesConstant()–
● Verifies that Quantity(1.0,KILOGRAM).add(Quantity(1000.0,GRAM)) returns Quantity(2.0,KILOGRAM).● Tests: Cross-unit addition willresult in the first operand's unit.
23.testAddition_CrossUnit_PoundPlusKilogram()– 
● Verifies that Quantity(2.20462,POUND).add(Quantity(1.0,KILOGRAM)) returnsQuantity(~4.40924, POUND).● Tests: Cross-unit addition withmixed metric and imperial units.
24.testAddition_ExplicitTargetUnit_Kilogram()– 
● Verifies that Quantity(1.0,KILOGRAM).add(Quantity(1000.0,GRAM), GRAM) returnsQuantity(2000.0, GRAM).
● Tests: Explicit target unitspecification in gram.
25.testAddition_Commutativity() – 
● Verifies that Quantity(1.0,KILOGRAM).add(Quantity(1000.0,GRAM)) equals Quantity(1000.0,GRAM).add(Quantity(1.0,KILOGRAM)) in their respectiveunits.
● Tests: Addition is commutative withappropriate unit conversions.
26.testAddition_WithZero() – 
● Verifies that Quantity(5.0,KILOGRAM).add(Quantity(0.0,GRAM)) returns Quantity(5.0,KILOGRAM).
● Tests: Adding zero acts as anidentity element.
27.testAddition_NegativeValues() –
● Verifies that Quantity(5.0,KILOGRAM).add(Quantity(-2000.0,GRAM)) returns Quantity(3.0,KILOGRAM).
● Tests: Addition with negativemeasurements.
28.testAddition_LargeValues() – 
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 22/24
● Verifies that Quantity(1e6,KILOGRAM).add(Quantity(1e6,KILOGRAM)) returnsQuantity(2e6, KILOGRAM).
● Tests: Addition with largemagnitude values.
Code Snippet for Test Cases
UC9 Quantity Measurement App Test Result5.1
UC9 Quantity Measurement App Sample TestResult 5.2
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 23/24
Published using Google Docs Report abuse Learn more
UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, …Updated automatically every 5minutes
19/06/2026, 08:41 UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
https://docs.google.com/document/d/e/2PACX-1vRaiGd5yu8X-YECdh5IrG6ES_vW88Ix56PrJI5zciNns9Qzk6_8b7MlaEwTqJzfh1_IoPKOHdCjn… 24/24