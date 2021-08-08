### Projeto de Controle de Ponto

Projeto desenvolvido utilizando <b>Spring Boot 2.3.1.RELEASE</b> e banco de dados H2.
Desenvolvi uma arquitetura mais simples e produtiva do que a forma que foi apresentada no curso, com isso tive a economia 
de mais ou menos 50 linhas de código por CRUD, são 11 CRUDs, dessa forma economizamos **550 linhas de código**.

O projeto roda na porta <b>8081</b>

Caminho para acessar o swagger : http://localhost:8081/swagger-ui

OBS: exemplo de crud mostrado no curso, todo esse código não é necessário da forma como desenvolvi a arquitetura utilizando
generics e abstracts.

    //controller
    @Autowired
    private JornadaService jornadaService;
    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }
    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }
    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }
    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) {
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
    //service
    private JornadaRepository jornadaRepository;
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }
    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }
    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }
    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
