#!/usr/bin/python
#coding: UTF-8

import os
import os.path
import time

def getDir(directory,level):
	print "    "+"|\t"*level+directory
	if os.path.isdir(directory):
		for lowDir in os.listdir(directory):
			getDir(directory+"/"+lowDir,level+1)
	
getDir("webContent",0)