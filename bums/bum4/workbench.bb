;******************************************************** ;*                                                      * ;*      BlitzII workbench.library Include file          * ;*                                                      * ;********************************************************  � exec.bb � "Intuition.bb"  ;*****************File:startup.h  � WBStartup= sm_Message.Message *sm_Process.MsgPort *sm_Segment.b sm_NumArgs.l *sm_ToolWindow.b *sm_ArgList.WBArg � �  � WBArg= *wa_Lock.b *wa_Name.b � �  ;*****************File:icon.h  � ICONNAME= "#icon.#library" � �  ;*****************File:workbench.h  #WBDISK= 1 #WBDRAWER= 2 #WBTOOL= 3 #WBPROJECT= 4 #WBGARBAGE= 5 #WBDEVICE= 6 #WBKICK= 7 #WBAPPICON= 8  � OldDrawerData= dd_NewWindow.NewWindow dd_CurrentX.l dd_CurrentY.l � �  #OLDDRAWERDATAFILESIZE= (#sizeof(#struct#OldDrawerData))  � DrawerData= dd_NewWindow.NewWindow dd_CurrentX.l dd_CurrentY.l dd_Flags.l dd_ViewModes.w � �  #DRAWERDATAFILESIZE= (#sizeof(#struct#DrawerData))  � DiskObject= do_Magic.w do_Version.w do_Gadget.Gadget do_Type.b *do_DefaultTool.b *star.b                 ;wo whoopy right here do_CurrentX.l do_CurrentY.l *do_DrawerData.DrawerData *do_ToolWindow.b do_StackSize.l � �  #WB_DISKMAGIC= $e310 #WB_DISKVERSION= 1 #WB_DISKREVISION= 1 #WB_DISKREVISIONMASK= 255  � FreeList= fl_NumFree.w fl_MemList.List � �  #MTYPE_PSTD= 1 #MTYPE_TOOLEXIT= 2 #MTYPE_DISKCHANGE= 3 #MTYPE_TIMER= 4 #MTYPE_CLOSEDOWN= 5 #MTYPE_IOPROC= 6 #MTYPE_APPWINDOW= 7 #MTYPE_APPICON= 8 #MTYPE_APPMENUITEM= 9 #MTYPE_COPYEXIT= 10 #MTYPE_ICONPUT= 11 #GADGBACKFILL= $0001 #NO_ICON_POSITION= ($80000000) � WORKBENCH_NAME= "#workbench.#library":� � #AM_VERSION= 1  � AppMessage= am_Message.Message am_Type.w am_UserData.l am_ID.l am_NumArgs.l *am_ArgList.WBArg am_Version.w am_Class.w am_MouseX.w am_MouseY.w am_Seconds.l am_Micros.l am_Reserved.l[8] � �   