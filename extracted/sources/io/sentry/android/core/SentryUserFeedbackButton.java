package io.sentry.android.core;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import defpackage.ue7;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SentryUserFeedbackButton extends Button {
    public static final /* synthetic */ int b = 0;
    public View.OnClickListener a;

    @Deprecated
    public SentryUserFeedbackButton(Context context) throws Exception {
        super(context);
        a(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, AttributeSet attributeSet, int i) throws Exception {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.SentryUserFeedbackButton, i, 0);
        try {
            float f = context.getResources().getDisplayMetrics().density;
            float dimension = typedArrayObtainStyledAttributes.getDimension(c1.SentryUserFeedbackButton_android_drawablePadding, -1.0f);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(c1.SentryUserFeedbackButton_android_drawableStart, -1);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(c1.SentryUserFeedbackButton_android_textAllCaps, false);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(c1.SentryUserFeedbackButton_android_background, -1);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(c1.SentryUserFeedbackButton_android_padding, -1.0f);
            int color = typedArrayObtainStyledAttributes.getColor(c1.SentryUserFeedbackButton_android_textColor, -1);
            String string = typedArrayObtainStyledAttributes.getString(c1.SentryUserFeedbackButton_android_text);
            if (dimension == -1.0f) {
                setCompoundDrawablePadding((int) (4.0f * f));
            }
            if (resourceId == -1) {
                setCompoundDrawablesRelativeWithIntrinsicBounds(z0.sentry_user_feedback_button_logo_24, 0, 0, 0);
            }
            setAllCaps(z);
            if (resourceId2 == -1) {
                setBackgroundResource(z0.sentry_oval_button_ripple_background);
            }
            if (dimension2 == -1.0f) {
                int i2 = (int) (f * 12.0f);
                setPadding(i2, i2, i2, i2);
            }
            if (color == -1) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
                setTextColor(context.getResources().getColor(typedValue.resourceId, context.getTheme()));
            }
            if (string == null) {
                setText("Report a Bug");
            }
            if (typedArrayObtainStyledAttributes instanceof AutoCloseable) {
                typedArrayObtainStyledAttributes.close();
            } else if (typedArrayObtainStyledAttributes instanceof ExecutorService) {
                defpackage.d1.m((ExecutorService) typedArrayObtainStyledAttributes);
            } else {
                typedArrayObtainStyledAttributes.recycle();
            }
            setOnClickListener(this.a);
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != 0) {
                try {
                    if (typedArrayObtainStyledAttributes instanceof AutoCloseable) {
                        typedArrayObtainStyledAttributes.close();
                    } else if (typedArrayObtainStyledAttributes instanceof ExecutorService) {
                        defpackage.d1.m((ExecutorService) typedArrayObtainStyledAttributes);
                    } else {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a = onClickListener;
        super.setOnClickListener(new ue7(11, this));
    }

    @Deprecated
    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    @Deprecated
    public SentryUserFeedbackButton(Context context, AttributeSet attributeSet, int i) throws Exception {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }
}
