package com.DeclarationAccessControl.Synchronized;

class VollatileKeyword
{
   // volatile keyword here makes sure that
   // the changes made in one thread are 
   // immediately reflect in other thread
   static volatile int sharedVar = 6;
}