package com.ahmedazooz.loginapp.viewsmodel;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;
import android.util.Patterns;
//import com.android.databinding.library.baseAdapters.BR;
import com.ahmedazooz.loginapp.model.user;

public class loginviewmodel extends BaseObservable {
    private user user;
    private String SuccessMessage="Login Succcefully";
    private String ErrorMessage="Email or password not correct";

    @Bindable
    private String toastMessage=null;

    public String getToastMessage(){
        return toastMessage;
    }
    private void setToastMessage(String ToastMessage){
        this.toastMessage=ToastMessage;
       // notifyPropertyChanged(BR.toastMessage);
    }
    @Bindable
    private void setUserEmail(String Email){
        user.setEmail(Email);
       // notifyPropertyChanged(BR.useremail);
    }

    private String getUserEmail(){
        return user.getEmail();
    }
    @Bindable
    private void setUserPassword(String Password){
        user.setPassword(Password);
       // notifyPropertyChanged(BR.userPassword);
    }

    private String getUserPassword(){
        return user.getPassword();
    }

    public loginviewmodel(){
        user=new user("","");
    }
    public void onLoginClick(){
        if (isInputValid()){
            setToastMessage(SuccessMessage);
        }else{
            setToastMessage(ErrorMessage);
        }
    }
    public boolean isInputValid(){
        return !TextUtils.isEmpty(getUserEmail())&& Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches()&& getUserPassword().length()>5;
    }

}
