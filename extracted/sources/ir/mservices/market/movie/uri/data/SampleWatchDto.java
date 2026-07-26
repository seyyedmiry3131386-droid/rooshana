package ir.mservices.market.movie.uri.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SampleWatchDto implements Serializable {

    @vo7("boxTitle")
    private final String boxTitle;

    @vo7("dialogDescription")
    private final String dialogDescription;

    @vo7("dialogTitle")
    private final String dialogTitle;

    @vo7("hint")
    private final String hint;

    @vo7("primaryButton")
    private final RestrictionInfoButtonDto primaryButton;

    public SampleWatchDto(String str, String str2, String str3, String str4, RestrictionInfoButtonDto restrictionInfoButtonDto) {
        this.boxTitle = str;
        this.hint = str2;
        this.dialogTitle = str3;
        this.dialogDescription = str4;
        this.primaryButton = restrictionInfoButtonDto;
    }

    public final String getBoxTitle() {
        return this.boxTitle;
    }

    public final String getDialogDescription() {
        return this.dialogDescription;
    }

    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final String getHint() {
        return this.hint;
    }

    public final RestrictionInfoButtonDto getPrimaryButton() {
        return this.primaryButton;
    }
}
