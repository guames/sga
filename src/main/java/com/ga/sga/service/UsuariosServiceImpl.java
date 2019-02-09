package com.ga.sga.service;

import com.ga.sga.dao.UsuariosDao;
import com.ga.sga.domain.Usuario;
import com.ga.sga.exception.SGAServiceException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService{

    private UsuariosDao uDao;

    public UsuariosServiceImpl(UsuariosDao uDao) {
        this.uDao = uDao;
    }

    public Usuario salvarUsuario(Usuario usuario) throws SGAServiceException {
        try {
            return uDao.salvarUsuario(usuario);
        } catch (Exception e) {
            throw new SGAServiceException();
        }
    }

    public void removerUsuario(Usuario usuario) throws SGAServiceException {
        try {
            uDao.removerUsuario(usuario);
        } catch (Exception e) {
            throw new SGAServiceException();
        }
    }

    public List<Usuario> listarUsuario() throws SGAServiceException {
        try {
            return uDao.listarUsuario();
        } catch (Exception e) {
            throw new SGAServiceException();
        }
    }
}
