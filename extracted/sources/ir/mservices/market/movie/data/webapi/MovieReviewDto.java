package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieReviewDto implements Serializable {

    @vo7("negativeLikes")
    private Integer _negativeLikes;

    @vo7("positiveLikes")
    private Integer _positiveLikes;

    @vo7("accountKey")
    private String accountKey;

    @vo7("avatarUrl")
    private String avatarUrl;

    @vo7("date")
    private String date;

    @vo7("id")
    private int id;

    @vo7("isLike")
    private boolean isLike;

    @vo7("nickname")
    private String nickname;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private String text;

    public MovieReviewDto(int i, String str, String str2, boolean z, String str3, String str4, Integer num, Integer num2, String str5) {
        js3.p(str2, "nickname");
        js3.p(str3, "date");
        this.id = i;
        this.avatarUrl = str;
        this.nickname = str2;
        this.isLike = z;
        this.date = str3;
        this.accountKey = str4;
        this._positiveLikes = num;
        this._negativeLikes = num2;
        this.text = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieReviewDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.MovieReviewDto");
        MovieReviewDto movieReviewDto = (MovieReviewDto) obj;
        return this.id == movieReviewDto.id && this.isLike == movieReviewDto.isLike && js3.i(this.text, movieReviewDto.text);
    }

    public final String getAccountKey() {
        return this.accountKey;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getId() {
        return this.id;
    }

    public final int getNegativeLikes() {
        Integer num = this._negativeLikes;
        return Math.abs(num != null ? num.intValue() : 0);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getPositiveLikes() {
        Integer num = this._positiveLikes;
        return Math.abs(num != null ? num.intValue() : 0);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int i = ((this.id * 31) + (this.isLike ? 1231 : 1237)) * 31;
        String str = this.text;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final boolean isLike() {
        return this.isLike;
    }

    public final void setAccountKey(String str) {
        this.accountKey = str;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final void setDate(String str) {
        js3.p(str, "<set-?>");
        this.date = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setLike(boolean z) {
        this.isLike = z;
    }

    public final void setNickname(String str) {
        js3.p(str, "<set-?>");
        this.nickname = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public /* synthetic */ MovieReviewDto(int i, String str, String str2, boolean z, String str3, String str4, Integer num, Integer num2, String str5, int i2, yd1 yd1Var) {
        this(i, str, str2, (i2 & 8) != 0 ? true : z, str3, str4, (i2 & 64) != 0 ? 0 : num, (i2 & 128) != 0 ? 0 : num2, str5);
    }
}
