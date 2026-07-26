package io.sentry.android.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import defpackage.ue7;
import defpackage.ur4;
import io.sentry.SentryLevel;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.e5;
import io.sentry.h4;
import ir.mservices.market.version2.webapi.responsedto.BindInfoDTO;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends AlertDialog {
    public boolean a;
    public io.sentry.protocol.v b;
    public DialogInterface.OnDismissListener c;
    public final b5 d;
    public l1 e;
    public o1 f;

    public p1(Context context) {
        Activity activity2;
        super(context, 0);
        this.a = false;
        b5 feedbackOptions = h4.b().m().getFeedbackOptions();
        b5 b5Var = new b5();
        b5Var.a = false;
        b5Var.b = true;
        b5Var.c = false;
        b5Var.d = true;
        b5Var.e = true;
        b5Var.f = true;
        b5Var.g = false;
        b5Var.a = feedbackOptions.a;
        b5Var.b = feedbackOptions.b;
        b5Var.c = feedbackOptions.c;
        b5Var.d = feedbackOptions.d;
        b5Var.e = feedbackOptions.e;
        b5Var.f = feedbackOptions.f;
        b5Var.g = feedbackOptions.g;
        b5Var.h = feedbackOptions.h;
        b5Var.i = feedbackOptions.i;
        this.d = b5Var;
        e5.d().a("UserFeedbackWidget");
        b5 feedbackOptions2 = h4.b().m().getFeedbackOptions();
        if (!b5Var.g || feedbackOptions2.g) {
            return;
        }
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity2 = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity2 = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity2 == null) {
            return;
        }
        this.e = new l1(h4.b().m().getLogger());
        WeakReference weakReference = new WeakReference(activity2);
        this.e.b(activity2, new ur4(this, weakReference, 24));
        Application application = activity2.getApplication();
        o1 o1Var = new o1(this, weakReference);
        this.f = o1Var;
        application.registerActivityLifecycleCallbacks(o1Var);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        io.sentry.protocol.g0 g0VarL;
        super.onCreate(bundle);
        setContentView(b1.sentry_dialog_user_feedback);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
        setCancelable(this.a);
        TextView textView = (TextView) findViewById(a1.sentry_dialog_user_feedback_title);
        ImageView imageView = (ImageView) findViewById(a1.sentry_dialog_user_feedback_logo);
        final TextView textView2 = (TextView) findViewById(a1.sentry_dialog_user_feedback_txt_name);
        final EditText editText = (EditText) findViewById(a1.sentry_dialog_user_feedback_edt_name);
        final TextView textView3 = (TextView) findViewById(a1.sentry_dialog_user_feedback_txt_email);
        final EditText editText2 = (EditText) findViewById(a1.sentry_dialog_user_feedback_edt_email);
        final TextView textView4 = (TextView) findViewById(a1.sentry_dialog_user_feedback_txt_description);
        final EditText editText3 = (EditText) findViewById(a1.sentry_dialog_user_feedback_edt_description);
        Button button = (Button) findViewById(a1.sentry_dialog_user_feedback_btn_send);
        Button button2 = (Button) findViewById(a1.sentry_dialog_user_feedback_btn_cancel);
        final b5 b5Var = this.d;
        if (b5Var.f) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (b5Var.b || b5Var.a) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText("Name");
            editText.setHint("Your Name");
            if (b5Var.a) {
                textView2.append(" (Required)");
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (b5Var.d || b5Var.c) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText(BindInfoDTO.BIND_TYPE_EMAIL);
            editText2.setHint("your.email@example.org");
            if (b5Var.c) {
                textView3.append(" (Required)");
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (b5Var.e && (g0VarL = h4.b().b().L()) != null) {
            editText.setText(g0VarL.c);
            editText2.setText(g0VarL.a);
        }
        textView4.setText("Description");
        textView4.append(" (Required)");
        editText3.setHint("What's the bug? What did you expect?");
        textView.setText("Report a Bug");
        button.setText("Send Bug Report");
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText4 = editText;
                String strTrim = editText4.getText().toString().trim();
                EditText editText5 = editText2;
                String strTrim2 = editText5.getText().toString().trim();
                EditText editText6 = editText3;
                String strTrim3 = editText6.getText().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                b5 b5Var2 = b5Var;
                if (zIsEmpty && b5Var2.a) {
                    editText4.setError(textView2.getText());
                    return;
                }
                if (strTrim2.isEmpty() && b5Var2.c) {
                    editText5.setError(textView3.getText());
                    return;
                }
                if (strTrim3.isEmpty()) {
                    editText6.setError(textView4.getText());
                    return;
                }
                io.sentry.protocol.j jVar = new io.sentry.protocol.j(strTrim3);
                jVar.c = strTrim;
                jVar.b = strTrim2;
                p1 p1Var = this.a;
                io.sentry.protocol.v vVar = p1Var.b;
                if (vVar != null) {
                    jVar.e = vVar;
                }
                if (h4.b().v().c(jVar).equals(io.sentry.protocol.v.b)) {
                    b5Var2.getClass();
                } else {
                    Context context = p1Var.getContext();
                    b5Var2.getClass();
                    Toast.makeText(context, "Thank you for your report!", 0).show();
                }
                p1Var.cancel();
            }
        });
        button2.setText("Cancel");
        button2.setOnClickListener(new ue7(12, this));
        setOnDismissListener(this.c);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        EditText editText = (EditText) findViewById(a1.sentry_dialog_user_feedback_edt_description);
        editText.getText().clear();
        editText.setError(null);
        b6 b6VarM = h4.b().m();
        b6VarM.getFeedbackOptions().getClass();
        b6VarM.getReplayController().d(Boolean.FALSE);
        this.b = b6VarM.getReplayController().k();
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.a = z;
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.c = onDismissListener;
        final Runnable runnable = h4.b().m().getFeedbackOptions().h;
        if (runnable != null) {
            super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.sentry.android.core.n1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    p1 p1Var = this.a;
                    p1Var.getClass();
                    runnable.run();
                    p1Var.b = null;
                    DialogInterface.OnDismissListener onDismissListener2 = p1Var.c;
                    if (onDismissListener2 != null) {
                        onDismissListener2.onDismiss(dialogInterface);
                    }
                }
            });
        } else {
            super.setOnDismissListener(this.c);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        io.sentry.c1 c1VarB = h4.b();
        b6 b6VarM = c1VarB.m();
        if (c1VarB.isEnabled() && b6VarM.isEnabled()) {
            super.show();
        } else {
            b6VarM.getLogger().i(SentryLevel.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }
}
