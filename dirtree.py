#!/usr/bin/python
#coding: UTF-8

import os
import os.path
import time

def getDir(directory,level):
	d = directory.split('/')
	print "    "+"|\t"*level+d[len(d)-1]
	if os.path.isdir(directory):
		for lowDir in os.listdir(directory):
			getDir(directory+"/"+lowDir,level+1)
	
print "src"
print 
getDir("src",0)
print 
print "webContent"
print 
getDir("webContent",0)