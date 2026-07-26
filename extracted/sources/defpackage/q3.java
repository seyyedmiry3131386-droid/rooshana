package defpackage;

import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.text.LineBreakConfig;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.ui.window.PopupLayout;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.a;
import ir.mservices.market.data.permission.Permission;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class q3 {
    public static wy a(AudioManager audioManager, ly lyVar) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) lyVar.b().b);
        HashMap map = new HashMap();
        map.put(2, new HashSet(a.a(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (j29.Q(format) || wy.e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(a.a(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(a.a(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        lj3 lj3VarM = ImmutableList.m();
        for (Map.Entry entry : map.entrySet()) {
            lj3VarM.O(new vy(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new wy(lj3VarM.S());
    }

    public static r79 b(AudioManager audioManager, ly lyVar) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) lyVar.b().b);
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return new r79(7, audioDevicesForAttributes.get(0));
    }

    public static PackageInfo c(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object d(Bundle bundle, String str) {
        return bundle.getParcelable(str, Uri.class);
    }

    public static Object e(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] f(Bundle bundle) {
        return bundle.getParcelableArray("BUNDLE_KEY_PERMISSIONS_PARCELABLE", Permission.class);
    }

    public static ArrayList g(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Serializable h(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static String i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics j(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean k(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean l(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList n(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static final void o(PopupLayout popupLayout, yl ylVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!o40.O(ylVar) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = popupLayout.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, ylVar);
    }

    public static final void p(PopupLayout popupLayout, yl ylVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!o40.O(ylVar) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = popupLayout.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(ylVar);
    }

    public static final void q(CursorAnchorInfo.Builder builder, sy6 sy6Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(uy6.s(sy6Var)).setHandwritingBounds(uy6.s(sy6Var)).build());
    }

    public static final void r(CursorAnchorInfo.Builder builder, sy6 sy6Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(uy6.s(sy6Var)).setHandwritingBounds(uy6.s(sy6Var)).build());
    }

    public static final void s(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static void t(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static Context u(Context context, Locale locale) {
        js3.p(context, "context");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            ((LocaleManager) context.getSystemService(LocaleManager.class)).setApplicationLocales(new LocaleList(locale));
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (i < 24) {
            configuration.setLocale(locale);
            Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            js3.m(contextCreateConfigurationContext);
            return contextCreateConfigurationContext;
        }
        configuration.setLocale(locale);
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        Context contextCreateConfigurationContext2 = context.createConfigurationContext(configuration);
        js3.m(contextCreateConfigurationContext2);
        return contextCreateConfigurationContext2;
    }
}
