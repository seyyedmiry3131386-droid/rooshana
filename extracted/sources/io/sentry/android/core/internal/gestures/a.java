package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import defpackage.o40;
import io.sentry.internal.gestures.UiElement$Type;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements io.sentry.internal.gestures.a {
    public final io.sentry.util.e a;

    public a(io.sentry.util.e eVar) {
        this.a = eVar;
    }

    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.b a(View view, float f, float f2, UiElement$Type uiElement$Type) {
        if (o40.O(view)) {
            if (uiElement$Type == UiElement$Type.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
                try {
                    return new io.sentry.internal.gestures.b(view, io.sentry.config.a.y(view), h.b(view), null, "old_view_system");
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            }
            if (uiElement$Type == UiElement$Type.SCROLLABLE) {
                boolean z = false;
                if (((!((Boolean) this.a.a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
                    z = true;
                }
                if (z) {
                    try {
                        return new io.sentry.internal.gestures.b(view, io.sentry.config.a.y(view), h.b(view), null, "old_view_system");
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
            }
        }
        return null;
    }
}
