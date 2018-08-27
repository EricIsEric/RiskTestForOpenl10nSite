#include <File.au3>
#include <MsgBoxConstants.au3>

;获取到当前exe文件所在的路径,并且通过相对路径选择到当前路径下的zip文件
Local $ZipPath = _PathFull(@ScriptDir & "\..\Risk01_EmptyZipFile\PPM_9.50_fi.zip")

;ControlFocus("title","text",controlID) Edit1=Edit instance 1
ControlFocus("打开", "","Edit1")

; Wait 10 seconds for the Upload window to appear
  WinWait("[CLASS:#32770]","",10)


; Set the File name text in the Edit field (将获取到的包含zip文件的路径变量ZipPath放到这里)
  ControlSetText("打开", "", "Edit1", $ZipPath)

;Sleep for 2 seconds
  Sleep(2000)

; Click on the Open button
  ControlClick("打开", "","Button1");