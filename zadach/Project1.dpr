program Project1;

{$APPTYPE CONSOLE}

{$R *.res}

uses
  System.SysUtils;

var k,i:integer;
  flag:boolean;
begin
  try
    flag:=false;
    write('������� ����� ��� ��������:');
    readln(k);
    i:=k-1;
    while i>1 do
    begin
      //writeln('k=',IntTOStr(k),' i=',IntTOStr(i));
      if (k mod i=0)  then begin
                flag:=True;
                break;
      end;
      dec(i);
    end;
    if not flag then writeln(IntTOStr(k), ' ������� �����')
       else writeln(IntTOStr(k), '��������� �����');
    readln;
    { TODO -oUser -cConsole Main : Insert code here }
  except
    on E: Exception do
      Writeln(E.ClassName, ': ', E.Message);
  end;
end.
