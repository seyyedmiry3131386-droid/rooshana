package defpackage;

import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class kr4 extends lr4 {
    public kr4(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}
