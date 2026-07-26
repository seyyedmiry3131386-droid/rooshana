package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.LocaleList;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class sg implements p96 {
    public Object a;
    public Object b;
    public Object c;

    public static void a(sg sgVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (((md1) sgVar.c) == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        ((zy) sgVar.b).b(routedDevice);
    }

    @Override // defpackage.p96
    public wc4 b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((rl3) this.c)) {
            try {
                wc4 wc4Var = (wc4) this.b;
                if (wc4Var != null && localeList == ((LocaleList) this.a)) {
                    return wc4Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new vc4(localeList.get(i)));
                }
                wc4 wc4Var2 = new wc4(arrayList);
                this.a = localeList;
                this.b = wc4Var2;
                return wc4Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        AudioTrack audioTrack = (AudioTrack) this.a;
        md1 md1Var = (md1) this.c;
        md1Var.getClass();
        audioTrack.removeOnRoutingChangedListener(md1Var);
        this.c = null;
    }

    @Override // defpackage.p96
    public Locale f(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (js3.i(localeForLanguageTag.toLanguageTag(), "und")) {
            t0.d("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
