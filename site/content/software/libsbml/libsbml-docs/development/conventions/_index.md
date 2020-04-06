+++
#=====================================================================
title  = "LibSBML coding conventions"
date   = 2020-04-02
layout = "single"
#=====================================================================
+++

{{< toc >}}

The following are guidelines that have generally been followed in
libSBML code. Not every piece of code adheres to them but we are trying
to move to a point where the code is as consistent as possible.

The following are the main issues.

## Do not be afraid of whitespace

1.  Indentation should be in multiples of 2 spaces
2.  Line length should never exceed 80 columns
3.  There should be 2 blank lines between each function definition in a
    header file
4.  There should be 2 blank lines between each function in a code file

<table>
<tbody>
<tr class="odd">
<td><p><strong>Good</strong></p></td>
<td><p><strong>Bad</strong></p></td>
</tr>
<tr class="even">
<td><pre><code>void function1()
{
  if (statement)
  { 
    some_other_very_long_
      statement_that_goes_on_and_on;
  }
}


void func2()
{
  do_nothing;
}</code></pre></td>
<td><pre><code>void function1()
{ if (statement) some_other_very_long_statement_that_goes_on_and_on;
}
void func2(){ do_nothing; }
 </code></pre></td>
</tr>
</tbody>
</table>

## Function code

1.  Curly brackets should have their own line
2.  Any return statement should be on a separate line
3.  Bracket sub-code to illustrate scope
4.  Leave blank lines between distinct bits of code
5.  Line up similar notation e.g. equals signs
6.  Leave spaces around operators/keywords

<table>
<tbody>
<tr class="odd">
<td><p><strong>Good</strong></p></td>
<td><p><strong>Bad</strong></p></td>
</tr>
<tr class="even">
<td><pre><code>void function1()
{
  if (statement)
  { 
    a     = 6;
    do_b  = 7;
  }

  return c;
}</code></pre></td>
<td><pre><code>void function1()
{  a=6;
   bbbb=5;
if (statement) return c;
}
 </code></pre></td>
</tr>
</tbody>
</table>

## Add tests

## Naming variables


<!-- Leave the following workaround for issues with Hugo toc generation -->
###
