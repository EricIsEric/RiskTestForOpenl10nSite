#include <File.au3>
#include <MsgBoxConstants.au3>

;��ȡ����ǰexe�ļ����ڵ�·��,����ͨ�����·��ѡ�񵽵�ǰ·���µ�zip�ļ�
Local $ZipPath = _PathFull(@ScriptDir & "\..\Risk02_DisallowedType\PPM_9.50_fi.jpg")

;ControlFocus("title","text",controlID) Edit1=Edit instance 1
ControlFocus("��", "","Edit1")

; Wait 10 seconds for the Upload window to appear
  WinWait("[CLASS:#32770]","",10)


; Set the File name text in the Edit field
  ControlSetText("��", "", "Edit1", $ZipPath)

;Sleep for 2 seconds
  Sleep(2000)

; Click on the Open button
  ControlClick("��", "","Button1");