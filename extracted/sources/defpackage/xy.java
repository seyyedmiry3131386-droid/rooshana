package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
public final class xy extends AudioDeviceCallback {
    public final /* synthetic */ zy a;

    public xy(zy zyVar) {
        this.a = zyVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zy zyVar = this.a;
        zyVar.a(wy.b(zyVar.a, zyVar.i, zyVar.h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zy zyVar = this.a;
        if (j29.l(audioDeviceInfoArr, zyVar.h)) {
            zyVar.h = null;
        }
        zyVar.a(wy.b(zyVar.a, zyVar.i, zyVar.h));
    }
}
