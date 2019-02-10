package com.ga.sga.service;

import com.ga.sga.dao.UsuarioDao;
import com.ga.sga.domain.Usuario;
import com.ga.sga.exception.SGAServiceException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService{

    private UsuarioDao uDao;

    public UsuariosServiceImpl(UsuarioDao uDao) {
        this.uDao = uDao;
    }

    public List<Usuario> listarUsuario() throws SGAServiceException {
        try {
            return (List<Usuario>) uDao.findAll();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public Usuario salvarUsuario(Usuario usuario) throws SGAServiceException {
        try {
            return uDao.save(usuario);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerUsuario(Long id) throws SGAServiceException {
        try {
            uDao.deleteById(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }
}
