package de.greenrobot.event.util;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(11)
public class ErrorDialogFragments$Honeycomb extends DialogFragment implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity2 = getActivity();
        if (!getArguments().getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) || activity2 == null) {
            return;
        }
        activity2.finish();
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity2 = getActivity();
        Bundle arguments = getArguments();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
        builder.setTitle(arguments.getString("de.greenrobot.eventbus.errordialog.title"));
        builder.setMessage(arguments.getString("de.greenrobot.eventbus.errordialog.message"));
        builder.setPositiveButton(R.string.ok, this);
        return builder.create();
    }
}
