from socket import *
import os
import platform

port = 9999
s = socket(AF_INET,SOCK_STREAM)
host = gethostname()
ip = gethostbyname(host)
s.bind((ip,port))
print("Started.....at ",ip)
s.listen()
print('listening on', (host, port))
#s.setblocking(False)
while True:
	print("in while")
	c,addr = s.accept()
	
	type = c.recv(1024).decode("UTF-8")
	if(type == "shutdown"):
		if(platform.system() == "Windows"):
			print("In Shutdown")
			os.system("shutdown /f")
		elif(platform.system() == "Linux"):
			os.system("shutdown")
			print("In Shutdown")	
	elif(type == "restart"):
		if(platform.system() == "Windows"):
			os.system("shutdown /r")
			print("In Restart")
		elif(platform.system() == "Linux"):
			os.system("shutdown -r")
			print("In Restart")
	elif(type == "music"):
		if(platform.system() == "Windows"):
			os.system("E:\\Movies\\Gravity2013.mp4")
			print("In Music")
		elif(platform.system() == "Linux"):
			os.system("~/a.mp4")
			print("In Music")
