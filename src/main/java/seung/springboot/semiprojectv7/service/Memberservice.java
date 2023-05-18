package seung.springboot.semiprojectv7.service;

import seung.springboot.semiprojectv7.model.Member;

import javax.servlet.http.HttpSession;

public interface Memberservice {
    boolean checkLogin(Member m, HttpSession sess);
}
