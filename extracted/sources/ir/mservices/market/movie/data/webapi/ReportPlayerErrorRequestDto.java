package ir.mservices.market.movie.data.webapi;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportPlayerErrorRequestDto implements RequestDTO {
    private int id;
    private String text;

    public ReportPlayerErrorRequestDto(int i, String str) {
        this.id = i;
        this.text = str;
    }

    public final int getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
