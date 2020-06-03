# EmployeeMonitor
Enables Windows screen recording and webcasting

## Use Case
This software allows the employers or administrators to monitor the desktop activities (ONLY WINDOWS OSs) of the employees. It records the screen of any computer you select and casts it through a web interface. 
This software can be used for almost any purpose (except gaming and intense framerate) and has a wide scope

## Disclaimer
This software has been developed having scope for ethical purposes only and the developer is NOT RESPOSIBLE FOR THE SOFTWARE'S USAGE FOR UNETHICAL PURPOSES

## Installation
*Fetch the installer package from the releases page and install the package
*Modify the config.txt file by replacing the IP Address with your machine's IP Address (only local ip addresses, public ip requires port forwarding in your router settingd)
*I have hardcoded the port as 7070 here, you can change it by recompiling the source code
*Open your-local-ip:7070 in the browser to view the footage (live only) ex. 192.168.1.2:7070
*All Done

## Modification Overview
*With view of Employee Monitoring, this app has been designed hide itself on start. To remove this feature and open additional settings:
  *Remove the element - 'panel1' from frmMain.designer.cs (i.e., frmMain.cs designer view) and remove the line 'this.hide()' from the whole code of frmMain.cs
  *In order to override text based ip-assignment, replace the variable text with the value - '----'

## TO-DO
- Program screen recording plugin :heavy_check_mark:
- Program Admin Panel
- Program Android App
