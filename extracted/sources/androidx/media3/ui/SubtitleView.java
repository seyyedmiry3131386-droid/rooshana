package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.c04;
import defpackage.fb8;
import defpackage.k81;
import defpackage.l81;
import defpackage.s17;
import defpackage.ym0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public List a;
    public ym0 b;
    public int c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public int h;
    public fb8 i;
    public View j;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<l81> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            k81 k81VarA = ((l81) this.a.get(i)).a();
            if (!this.f) {
                k81VarA.n = false;
                CharSequence charSequence = k81VarA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        k81VarA.a = SpannableString.valueOf(charSequence);
                        k81VarA.b = null;
                    }
                    CharSequence charSequence2 = k81VarA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof c04)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                s17.e(k81VarA);
            } else if (!this.g) {
                s17.e(k81VarA);
            }
            arrayList.add(k81VarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private ym0 getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        ym0 ym0Var = ym0.g;
        if (zIsInEditMode) {
            return ym0Var;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            ym0Var = new ym0(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return ym0Var;
    }

    private <T extends View & fb8> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).b.destroy();
        }
        this.j = t;
        this.i = t;
        addView(t);
    }

    public final void a() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        a();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        a();
    }

    public void setCues(List<l81> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        a();
    }

    public void setFixedTextSize(int i, float f) {
        Context context = getContext();
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        this.c = 2;
        this.d = fApplyDimension;
        a();
    }

    public void setFractionalTextSize(float f) {
        setFractionalTextSize(f, false);
    }

    public void setStyle(ym0 ym0Var) {
        this.b = ym0Var;
        a();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i) {
        if (this.h == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext(), null));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext(), null));
        }
        this.h = i;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = ym0.g;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, null);
        this.i = canvasSubtitleOutput;
        this.j = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.h = 1;
    }

    public void setFractionalTextSize(float f, boolean z) {
        this.c = z ? 1 : 0;
        this.d = f;
        a();
    }
}
