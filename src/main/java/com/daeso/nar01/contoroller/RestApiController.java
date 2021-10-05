//package com.daeso.nar01.contoroller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//@RequiredArgsConstructor
//public class RestApiController {
//
//    //생성자 주입으로 AccountRepository를 주입시켜줍니다.
//    private final AccountRepository accountRepository;
//
//    // 생성
//    @PostMapping("/account")
//    public ResponseEntity<?> saveAccount(@RequestBody Account account) {
//        Account savedAccount = accountRepository.save(account);
//        return ResponseEntity.ok(savedAccount);
//    }
//
//    // 목록 조회
//    @GetMapping("/account")
//    public List<Account> all() {
//        return accountRepository.findAll();
//    }
//
//    // 단건 조회
//    @GetMapping("/account/{id}")
//    public Account getAccount(@PathVariable Long id) {
//        return accountRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("illegal argument :" + id));
//    }
//
//    // 수정
//    @PutMapping("/{id}")
//    public void updateAccount(@PathVariable Long id, @RequestBody Account newAccount) {
//        accountRepository.findById(id)
//                .map(account -> {
//                    account.setName(newAccount.getName());
//                    account.setPassword(newAccount.getPassword());
//                    return accountRepository.save(account);
//                })
//                .orElseGet(() -> {
//                    newAccount.setId(id);
//                    return accountRepository.save(newAccount);
//                });
//    }
//
//    // 삭제
//    @DeleteMapping("/{id}")
//    public void deleteAccount(@PathVariable Long id) {
//        accountRepository.deleteById(id);
//    }
//}
